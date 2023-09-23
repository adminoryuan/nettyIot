package org.example.process.strategy;

import io.netty.channel.Channel;
import io.netty.channel.socket.SocketChannel;

import org.example.entity.CmdTypeEnum;
import org.example.entity.RequestHeaderFrame;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 存放包裹处理策略
 */
@Service("PutParcelStrategy")
public class PutParcelStrategy implements ProcessStrategy{

    @Override
    public void Process(Channel channel, RequestHeaderFrame frame) {

    }
}
