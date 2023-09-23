package org.example.process.strategy;

import io.netty.channel.Channel;
import io.netty.channel.socket.SocketChannel;
import org.example.entity.HeaderFrame;

/**
 * 存放包裹处理策略
 */
public class PutParcelStrategy implements ProcessStrategy{
    @Override
    public void Process(Channel channel, HeaderFrame frame) {

    }
}
