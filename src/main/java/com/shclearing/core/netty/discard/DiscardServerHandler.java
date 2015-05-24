package com.shclearing.core.netty.discard;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * User: changejava
 * Date: 2014/12/31
 * Time: 17:16
 * 实现discard 协议
 */
public class DiscardServerHandler extends SimpleChannelInboundHandler {


  @Override
  protected void messageReceived(ChannelHandlerContext ctx, Object msg) throws Exception {
    //discard
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
