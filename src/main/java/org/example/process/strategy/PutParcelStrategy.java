package org.example.process.strategy;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.Channel;
import io.netty.channel.socket.SocketChannel;

import org.example.cache.CacheService;
import org.example.entity.CmdTypeEnum;
import org.example.entity.RequestHeaderFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * 存放包裹处理策略
 */
@Service("PutParcelStrategy")
public class PutParcelStrategy implements ProcessStrategy{
    private int UIDLENGTH=8;
    private int PUTID=8;
    private int PACKGEID=16;

    @Autowired
    CacheService service;
    @Override
    public void Process(Channel channel, RequestHeaderFrame frame) {
        ByteBuf buf = frame.getData();
        byte[] uidArray= new byte[UIDLENGTH];
        buf.readBytes(uidArray);
        byte[] putArray= new byte[UIDLENGTH];
        buf.readBytes(putArray);
        byte[] packageIdArray= new byte[PACKGEID];
        buf.readBytes(packageIdArray);



    }
}
