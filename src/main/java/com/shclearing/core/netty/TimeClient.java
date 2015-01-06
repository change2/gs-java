package com.shclearing.core.netty;

import com.shclearing.core.netty.decoder.TimeDecoder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * User: changejava
 * Date: 2015/1/4
 * Time: 13:37
 */
public class TimeClient {


  public static void main(String[] args) {
    String host;
    int port;
    if (args.length >= 2) {
      host = args[0];
      port = Integer.parseInt(args[1]);
    } else {
      host = "127.0.0.1";
      port = 8080;
    }
    EventLoopGroup workerGroup = new NioEventLoopGroup();
    Bootstrap bootstrap = new Bootstrap();

    bootstrap.group(workerGroup);
    bootstrap.channel(NioSocketChannel.class);
    bootstrap.option(ChannelOption.SO_KEEPALIVE, true);
    bootstrap.handler(new ChannelInitializer<NioSocketChannel>() {
      @Override
      protected void initChannel(NioSocketChannel ch) throws Exception {
        ch.pipeline().addLast(new TimeDecoder(),new TimeClientHandler());
      }
    });

    try {
      ChannelFuture f = bootstrap.connect(host, port).sync();
      f.channel().closeFuture().sync();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      workerGroup.shutdownGracefully();
    }
  }

}
