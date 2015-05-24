package com.shclearing.core.netty.http;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpVersion;

import static io.netty.handler.codec.http.HttpResponseStatus.CONTINUE;
import static io.netty.handler.codec.http.HttpResponseStatus.OK;

/**
 * User: changejava
 * Date: 2015/1/7
 * Time: 15:39
 */
public class HttpServerHandler extends ChannelHandlerAdapter {
  private static final byte[] CONTENT = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};

  @Override
  public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
    ctx.flush();
  }

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
    cause.printStackTrace();
    ctx.close();
  }


  @Override
  public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
    if (msg instanceof HttpRequest) {
      HttpRequest request = (HttpRequest) msg;
      if (HttpHeaders.is100ContinueExpected(request)) {
        ctx.write(new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, CONTINUE));
      }

      boolean keepAlive = HttpHeaders.isKeepAlive(request);
      DefaultFullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, OK, Unpooled.wrappedBuffer(CONTENT));
      response.headers().set(HttpHeaders.Names.CONTENT_TYPE, "text/plain");

      response.headers().set(HttpHeaders.Names.CONTENT_LENGTH, response.content().readableBytes());
      if (!keepAlive) {
        ctx.write(response).addListener(ChannelFutureListener.CLOSE);
      } else {
        response.headers().set(HttpHeaders.Names.CONNECTION, "keep-alive");
        ctx.write(response).addListener(ChannelFutureListener.CLOSE);
      }
    }
    //else discard
  }
}
