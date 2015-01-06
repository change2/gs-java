package com.shclearing.core.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/**
 * User: changejava
 * Date: 2014/12/31
 * Time: 17:16
 * 实现discard 协议
 */
public class DiscardServerHandler extends ChannelHandlerAdapter {

  @Override
  public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
//    super.channelRead(ctx, msg);
//    ((ByteBuf)msg).release();
    try {
      ByteBuf in = (ByteBuf) msg;
//      while (in.isReadable()) {
//        System.out.println((char) in.readByte());
//        System.out.flush();
//      }
//      System.out.println(in.toString(CharsetUtil.UTF_8));
//      System.out.println(in.release());
//      ctx.write(msg);//echo 协议
      ctx.writeAndFlush(msg);
    } finally {
//      ReferenceCountUtil.release(msg);//丢弃msg
    }
  }

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
    try {
      cause.printStackTrace();
    } finally {
      ctx.close();
    }
  }

  @Override
  public void disconnect(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
    super.disconnect(ctx, promise);
    SocketAddress address = ctx.channel().remoteAddress();
    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
    System.out.println(inetSocketAddress.getAddress() + " " + inetSocketAddress.getPort() + " disconnect");
  }

  @Override
  public void channelActive(ChannelHandlerContext ctx) throws Exception {
    super.channelActive(ctx);
    SocketAddress address = ctx.channel().remoteAddress();
    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
    System.out.println(inetSocketAddress.getAddress() + " " + inetSocketAddress.getPort() + " connect");
  }

  @Override
  public void close(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
    super.close(ctx, promise);
    SocketAddress address = ctx.channel().remoteAddress();
    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
    System.out.println(inetSocketAddress.getAddress() + " " + inetSocketAddress.getPort() + " connect");
  }
}
