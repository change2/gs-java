package com.shclearing.core.netty;

import com.shclearing.core.netty.pojo.UnixTime;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
/**
 * User: changejava
 * Date: 2015/1/4
 * Time: 13:43
 */
public class TimeClientHandler extends ChannelHandlerAdapter {
//  private ByteBuf buf;
//
//  @Override
//  public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
//    buf = ctx.alloc().buffer(6);
//  }
//
//  @Override
//  public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
//    buf.release();
//    buf = null;
//  }

  @Override
  public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
    UnixTime m = (UnixTime) msg;
    try {
        System.out.println(m.toString());
        ctx.close();
    } finally {

    }

  }

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
    cause.printStackTrace();
    ctx.close();

  }
}
