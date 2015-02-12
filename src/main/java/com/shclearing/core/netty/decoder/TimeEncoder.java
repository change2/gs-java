package com.shclearing.core.netty.decoder;

import com.shclearing.core.netty.pojo.UnixTime;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;

/**
 * User: changejava
 * Date: 2015/1/6
 * Time: 11:10
 * 消息编码
 */
public class TimeEncoder extends ChannelHandlerAdapter {

  @Override
  public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
    UnixTime unixTime = (UnixTime) msg;
    ByteBuf buf = ctx.alloc().buffer(6);
    buf.writeInt((int) (System.currentTimeMillis() / 1000L));
    buf.writeBytes(unixTime.getReserve().getBytes());
    ctx.write(buf, promise);
  }
}
