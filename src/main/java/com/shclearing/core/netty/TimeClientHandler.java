package com.shclearing.core.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

import java.util.Date;

/**
 * User: changejava
 * Date: 2015/1/4
 * Time: 13:43
 */
public class TimeClientHandler extends ChannelHandlerAdapter {


  @Override
  public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
    ByteBuf buf = (ByteBuf) msg;
    try {
      long currentTimeMillis = (buf.readInt()) * 1000L;
      System.out.println(new Date(currentTimeMillis));
      ctx.close();
    } finally {
      buf.release();
    }

  }

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
    cause.printStackTrace();
    ctx.close();

  }
}
