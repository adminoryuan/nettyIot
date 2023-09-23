package org.example;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import org.example.codec.HeaderFrameDecoder;
import org.example.codec.HeaderFrameEncoder;
import org.example.handle.HevingHandle;

public class ServerInitializer extends ChannelInitializer {
    @Override
    protected void initChannel(Channel ch) throws Exception {
        ch.pipeline()
                .addLast(new HeaderFrameEncoder())
                .addLast(new HeaderFrameDecoder())
                .addLast(new HevingHandle());
    }
}
