package com.shclearing.core.netty.decoder;

import com.shclearing.core.netty.pojo.UnixTime;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * User: changejava
 * Date: 2015/1/7
 * Time: 12:50
 */
public class MessageTimeDecoder extends MessageToByteEncoder<UnixTime> {


  @Override
  protected void encode(ChannelHandlerContext ctx, UnixTime msg, ByteBuf out) throws Exception {
    out.writeInt(msg.getValue());
    out.writeBytes(msg.getReserve().getBytes());
  }
}
