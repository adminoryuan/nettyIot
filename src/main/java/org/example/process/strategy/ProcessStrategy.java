package org.example.process.strategy;

import io.netty.channel.Channel;
import io.netty.channel.socket.SocketChannel;
import org.example.entity.RequestHeaderFrame;

public interface ProcessStrategy {
    void  Process(Channel channel, RequestHeaderFrame frame);
}
