package com.badgehu.rpc;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RpcProxyServer {

    ExecutorService executorService = Executors.newCachedThreadPool();

    public void publisher(Object service,int port){
        ServerSocket serverSocket=null;
        try {
             serverSocket = new ServerSocket(port);
             while (true){ // 不断接受请求
                 Socket socket = serverSocket.accept(); //BIO
                 executorService.execute(new ProcessorHandler(service,socket));
             }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
