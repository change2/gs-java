package com.shclearing.core.netty.decoder;

import com.shclearing.core.netty.pojo.UnixTime;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * User: changejava
 * Date: 2015/1/6
 * Time: 10:45
 * 客户端解码到指定对象
 */
public class TimeDecoder extends ByteToMessageDecoder {


  @Override
  protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
    if (in.readableBytes() < 6) {
      return;
    }
    out.add(new UnixTime(in.readInt(),new String(new byte[]{in.readByte(),in.readByte()})));
  }
}
