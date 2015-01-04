package com.shclearing.core.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

/**
 * User: changejava
 * Date: 2015/1/4
 * Time: 13:12
 */
public class TimeServerHandler extends ChannelHandlerAdapter {

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
    cause.printStackTrace();
    ctx.close();
  }

  @Override
  public void channelActive(final ChannelHandlerContext ctx) throws Exception {
    final ByteBuf time = ctx.alloc().buffer(4);
    int value = (int) (System.currentTimeMillis() / 1000L);
    System.out.println(value);
    time.writeInt(value);
    final ChannelFuture channelFuture = ctx.writeAndFlush(time);
    channelFuture.addListener(new ChannelFutureListener() {
      @Override
      public void operationComplete(ChannelFuture future) throws Exception {
        assert channelFuture == future;
        ctx.close();
      }
    });
  }
}
