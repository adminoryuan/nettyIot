package org.example;

import com.sun.corba.se.internal.CosNaming.BootstrapServer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.ServerSocketChannel;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class App {
    private static final String addr="";
    private static final  Integer port=8888;
    public static void main(String[] args) {
        NioEventLoopGroup eventExecutors = new NioEventLoopGroup();
        NioEventLoopGroup eventExecutors1 = new NioEventLoopGroup();

        try {
            StartServer(eventExecutors,eventExecutors1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private  static  void StartServer(NioEventLoopGroup boss,NioEventLoopGroup work) throws InterruptedException {
        ServerBootstrap bootStrap=new ServerBootstrap()
                .group(boss,work)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ServerInitializer());
        Channel channel = bootStrap.bind(addr, port)
                .sync()
                .channel();
        log.info("服务启动成功",addr,":",port);
        channel
                .closeFuture()
                .sync();

    }
}