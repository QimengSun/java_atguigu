package com.sqm.java3;

import org.omg.CORBA.ServerRequest;

/**
 * @author: sqm
 * @date: 2020/8/14 18:25
 * @description:设计方法————代理模式
 */
public class NetWorkTest {

    public static void main(String[] args) {
        Server server = new Server();
        ProxyServer proxyserver = new ProxyServer(server);

        proxyserver.browse();
    }
}

interface NetWork{
    public void browse();
}


//被代理类
class Server implements NetWork{

    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}


//代理类
class ProxyServer implements NetWork{

    private NetWork work;

    public ProxyServer(NetWork work){
        this.work = work;
    }

    public void check(){
        System.out.println("联网之前的检查");
    }


    @Override
    public void browse() {
        check();
        work.browse();
    }
}