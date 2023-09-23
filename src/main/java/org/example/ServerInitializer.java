package org.example;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import org.example.codec.HeaderFrameDecoder;
import org.example.codec.HeaderFrameEncoder;
import org.example.handle.HevingHandle;
import org.example.spring.SpringLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServerInitializer extends ChannelInitializer {
    @Autowired
    HevingHandle hevingHandle;

    @Override
    protected void initChannel(Channel ch) throws Exception {
        ch.pipeline()
                .addLast(SpringLoader.getBean(HeaderFrameDecoder.class))
                .addLast(SpringLoader.getBean(HeaderFrameEncoder.class))
                .addLast(hevingHandle);
    }
}
