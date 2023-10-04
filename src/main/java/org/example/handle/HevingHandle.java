package org.example.handle;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.RequestHeaderFrame;
import org.example.process.ProcessFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class HevingHandle extends SimpleChannelInboundHandler<RequestHeaderFrame> {
    @Autowired
    ProcessFactory factory;

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, RequestHeaderFrame msg) throws Exception {
                factory
                    .GetProcess(msg.getFrameType())
                    .Process(ctx.channel(),msg);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        log.warn("ip ",ctx.channel().localAddress(),"断开");
    }
}
