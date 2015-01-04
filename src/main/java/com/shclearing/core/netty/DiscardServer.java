package com.shclearing.core.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * User: changejava
 * Date: 2014/12/31
 * Time: 17:22
 */
public class DiscardServer {

  private int port;

  public DiscardServer(int port) {
    this.port = port;
  }

  public static void main(String[] args) throws InterruptedException {
    int port;
    if (args.length > 1) {
      port = Integer.parseInt(args[0]);
    } else {
      port = 8080;
    }

    DiscardServer server = new DiscardServer(port);
    server.run();


  }

  public void run() throws InterruptedException {
    EventLoopGroup bossGroup = new NioEventLoopGroup();
    EventLoopGroup workGroup = new NioEventLoopGroup();
    try {
      ServerBootstrap bootstrap = new ServerBootstrap();

      bootstrap.group(bossGroup, workGroup)
        .channel(NioServerSocketChannel.class)
        .childHandler(new ChannelInitializer<SocketChannel>() {
          @Override
          protected void initChannel(SocketChannel ch) throws Exception {
            ch.pipeline().addLast(new DiscardServerHandler(), new TimeServerHandler());
          }
        })
        .option(ChannelOption.SO_BACKLOG, 128)
        .childOption(ChannelOption.SO_KEEPALIVE, true);

      ChannelFuture f = bootstrap.bind(port).sync();
      f.channel().closeFuture().sync();
    } finally {
      workGroup.shutdownGracefully();
      bossGroup.shutdownGracefully();

    }
  }

}
