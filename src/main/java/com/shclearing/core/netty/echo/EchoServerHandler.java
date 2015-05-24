package com.shclearing.core.netty.echo;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

/**
 * User: changejava
 * Date: 2014/12/31
 * Time: 17:16
 * 实现discard 协议
 */
public class EchoServerHandler extends ChannelHandlerAdapter {


  @Override
  public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
    ctx.write(msg);
  }

  @Override
  public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
    ctx.flush();
  }

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
    try {
      cause.printStackTrace();
    } finally {
      ctx.close();
    }
  }

}
