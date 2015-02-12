package com.shclearing.core.netty;

import com.shclearing.core.netty.decoder.TimeEncoder;
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
public class TimeServer {

  private int port;

  public TimeServer(int port) {
    this.port = port;
  }

  public static void main(String[] args) throws InterruptedException {
    int port;
    if (args.length > 1) {
      port = Integer.parseInt(args[0]);
    } else {
      port = 8080;
    }

    TimeServer server = new TimeServer(port);
    server.run();


  }

  public void run() throws InterruptedException {
    EventLoopGroup bossGroup = new NioEventLoopGroup(20);
    EventLoopGroup workGroup = new NioEventLoopGroup(20);
    try {
      ServerBootstrap b = new ServerBootstrap();
      b.group(bossGroup, workGroup)
        .channel(NioServerSocketChannel.class)
        .childHandler(new ChannelInitializer<SocketChannel>() {
          @Override
          protected void initChannel(SocketChannel ch) throws Exception {
            ch.pipeline().addLast(new TimeEncoder(), new TimeServerHandler());
          }
        })
        .option(ChannelOption.SO_BACKLOG, 128)
        .option(ChannelOption.SO_TIMEOUT, 2000)
        .childOption(ChannelOption.SO_KEEPALIVE, true)
        .childOption(ChannelOption.TCP_NODELAY, true);

      ChannelFuture f = b.bind(port).sync();
      f.channel().closeFuture().sync();
    } finally {
      workGroup.shutdownGracefully();
      bossGroup.shutdownGracefully();

    }
  }

}
