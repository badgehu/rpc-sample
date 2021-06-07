package com.badgehu.rpc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
//        RpcProxyClient rpcProxyClient = new RpcProxyClient();
//        IHelloService iHelloService = rpcProxyClient.clientProxy
//                (IHelloService.class,"localhost",8080);
//        String result = iHelloService.sayHello("tom");
//        iHelloService.saveUser(new User());
        //修改为使用spring容器管理，不用new对象
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        RpcProxyClient rpcProxyClient = context.getBean(RpcProxyClient.class);
        IHelloService iHelloService = rpcProxyClient.clientProxy
                (IHelloService.class,"localhost",8080);
        String result = iHelloService.sayHello("tom");
        System.out.println(result);
    }
}
