package com.badgehu.rpc;

@RpcService(IHelloService.class)
public class HelloServiceImpl implements IHelloService{
    public String sayHello(String content) {
        System.out.println("request in sayHello:"+ content);
        return "request in sayHello:"+ content;
    }

    public String saveUser(User user) {
        return null;
    }
}
