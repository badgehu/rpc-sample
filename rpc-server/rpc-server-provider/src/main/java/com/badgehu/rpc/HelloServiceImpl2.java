package com.badgehu.rpc;

@RpcService(value = IHelloService.class,version = "V2.0")
public class HelloServiceImpl2 implements IHelloService{
    public String sayHello(String content) {
        System.out.println("[v2.0]request in sayHello:"+ content);
        return "[v2.0]request in sayHello:"+ content;
    }

    public String saveUser(User user) {
        return null;
    }
}
