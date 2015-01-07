package com.shclearing.core.netty.discard;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

/**
 * User: changejava
 * Date: 2015/1/7
 * Time: 13:32
 */
public class DiscardClient {
  static final String HOST = System.getProperty("HOST", "127.0.0.1");
  static final int PORT = Integer.parseInt(System.getProperty("port", "8080"));
  static final int SIZE = Integer.parseInt(System.getProperty("size", "256"));

  public static void main(String[] args) {
    EventLoopGroup group = new NioEventLoopGroup();
    Bootstrap b = new Bootstrap();
    b.group(group)
      .channel(NioSocketChannel.class)
      .handler(new LoggingHandler(LogLevel.DEBUG))
      .handler(new ChannelInitializer<SocketChannel>() {
        @Override
        protected void initChannel(SocketChannel ch) throws Exception {
          ChannelPipeline c = ch.pipeline();
          c.addLast(new DiscardClientHandler());
        }
      });

    try {
      ChannelFuture f = b.connect(HOST, PORT).sync();
      f.channel().closeFuture().sync();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      group.shutdownGracefully();
    }
  }

}
