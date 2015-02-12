package com.shclearing.core.netty;

import com.shclearing.core.netty.pojo.UnixTime;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * User: changejava
 * Date: 2015/1/4
 * Time: 13:12
 */
public class TimeServerHandler extends ChannelHandlerAdapter {
  public final static AtomicInteger clientCount = new AtomicInteger();

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
    cause.printStackTrace();
    ctx.close();
  }

  @Override
  public void channelActive(final ChannelHandlerContext ctx) throws Exception {
//    final ByteBuf time = ctx.alloc().buffer(6);
//    int value = (int) (System.currentTimeMillis() / 1000L);
//    String msg ="ha";
//    System.out.println(value);
//    time.writeInt(value);
//    time.writeBytes(msg.getBytes());
//    final ChannelFuture channelFuture = ctx.writeAndFlush(time);
//    channelFuture.addListener(new ChannelFutureListener() {
//      @Override
//      public void operationComplete(ChannelFuture future) throws Exception {
//        assert channelFuture == future;
//        ctx.close();
//      }
//    });
    ChannelFuture f = ctx.writeAndFlush(new UnixTime((int) (System.currentTimeMillis() / 1000L), "ha"));
//    f.addListener(ChannelFutureListener.CLOSE);
    clientCount.incrementAndGet();
    if (clientCount.intValue() % 1000 == 0) {
      System.out.printf("在线人数 %d\n", clientCount.intValue());
      System.out.flush();
    }
  }

  @Override
  public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
    ctx.flush();
    ctx.fireChannelReadComplete();
  }

  @Override
  public void close(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
    super.close(ctx, promise);
//    SocketAddress address = ctx.channel().remoteAddress();
//    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
//    System.out.println(inetSocketAddress.getAddress() + " " + inetSocketAddress.getPort() + " disconnect");
  }
}
