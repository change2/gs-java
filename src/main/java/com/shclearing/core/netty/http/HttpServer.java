package com.shclearing.core.netty.http;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

/**
 * User: changejava
 * Date: 2015/1/7
 * Time: 15:31
 */
public class HttpServer {

  static final boolean SSL = System.getProperty("ssl") != null;
  static final int PORT = Integer.parseInt(System.getProperty("port", SSL ? "8443" : "8080"));

  public static void main(String[] args) {

    NioEventLoopGroup boss = new NioEventLoopGroup(1);
    NioEventLoopGroup work = new NioEventLoopGroup();

    ServerBootstrap b = new ServerBootstrap();
    b.option(ChannelOption.SO_BACKLOG, 1024);
    b.group(boss, work)
      .channel(NioServerSocketChannel.class)
      .handler(new LoggingHandler(LogLevel.INFO))
      .childHandler(new HttpServerInitializer());
    try {
      ChannelFuture f = b.bind(PORT).sync();
      f.channel().closeFuture().sync();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      boss.shutdownGracefully();
      work.shutdownGracefully();
    }
  }

}
