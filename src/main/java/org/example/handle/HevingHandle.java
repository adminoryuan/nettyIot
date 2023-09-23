package org.example.handle;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.example.entity.HeaderFrame;
import org.example.process.ProcessFactory;

public class HevingHandle extends SimpleChannelInboundHandler<HeaderFrame> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, HeaderFrame msg) throws Exception {
        ProcessFactory.GetProcess(msg.getFrameType())
                .Process(ctx.channel(),msg);
    }
}
