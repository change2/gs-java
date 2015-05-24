package com.shclearing.core.netty.discard;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * User: changejava
 * Date: 2015/1/7
 * Time: 13:37
 */
public class DiscardClientHandler extends SimpleChannelInboundHandler<Object> {

  private final ChannelFutureListener trafficGenerator = new ChannelFutureListener() {
    @Override
    public void operationComplete(ChannelFuture future) throws Exception {
      if (future.isSuccess()) {
        generateTraffic();
      } else {
        future.cause().printStackTrace();
        future.channel().close();
      }
    }
  };
  private ByteBuf content;
  private ChannelHandlerContext ctx;

  @Override
  protected void messageReceived(ChannelHandlerContext ctx, Object msg) throws Exception {

  }

  @Override
  public void channelActive(ChannelHandlerContext ctx) throws Exception {
    this.ctx = ctx;
    //分配直接直接全部填充为：NUL(0x00)
    content = ctx.alloc().directBuffer(DiscardClient.SIZE).writeZero(DiscardClient.SIZE);

    generateTraffic();
    super.channelActive(ctx);
  }

  private void generateTraffic() {
    ctx.writeAndFlush(content.duplicate().retain()).addListener(trafficGenerator);
  }

  @Override
  public void channelInactive(ChannelHandlerContext ctx) throws Exception {
    super.channelInactive(ctx);
    content.release();
  }

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
    cause.printStackTrace();
    ctx.close();
    super.exceptionCaught(ctx, cause);
  }
}
