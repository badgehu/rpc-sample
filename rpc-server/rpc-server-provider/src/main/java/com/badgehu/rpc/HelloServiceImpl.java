package com.badgehu.rpc;

@RpcService(value = IHelloService.class,version = "V1.0")
public class HelloServiceImpl implements IHelloService{
    public String sayHello(String content) {
        System.out.println("[v1.0]request in sayHello:"+ content);
        return "[v1.0]request in sayHello:"+ content;
    }

    public String saveUser(User user) {
        return null;
    }
}
