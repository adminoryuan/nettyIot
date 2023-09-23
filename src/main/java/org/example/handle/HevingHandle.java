package org.example.handle;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.example.entity.RequestHeaderFrame;
import org.example.process.ProcessFactory;

public class HevingHandle extends SimpleChannelInboundHandler<RequestHeaderFrame> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, RequestHeaderFrame msg) throws Exception {
        ProcessFactory
                        .GetProcess(msg.getFrameType())
                       .Process(ctx.channel(),msg);
    }
}
