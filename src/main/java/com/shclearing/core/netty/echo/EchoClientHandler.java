package com.shclearing.core.netty.echo;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

/**
 * User: changejava
 * Date: 2015/1/7
 * Time: 13:37
 */
public class EchoClientHandler extends ChannelHandlerAdapter {
  private final ByteBuf firstMessage;

  public EchoClientHandler() {
    firstMessage = Unpooled.buffer(EchoClient.SIZE);
    for (int i = 0; i < firstMessage.capacity(); i++) {
      firstMessage.writeByte((byte) i);
    }
  }

  @Override
  public void channelActive(ChannelHandlerContext ctx) throws Exception {
    ctx.writeAndFlush(firstMessage);
  }

  @Override
  public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
    ByteBuf buf = (ByteBuf) msg;
    if (buf.readableBytes() == EchoClient.SIZE) {
      while (buf.isReadable()) {
        System.out.print(buf.readByte() + "|");
        System.out.flush();
      }
    }
  }

  @Override
  public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
    ctx.flush();
  }

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
    cause.printStackTrace();
    ctx.close();
  }
}
