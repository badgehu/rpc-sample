package com.badgehu.rpc;

public class HelloServiceImpl implements IHelloService{
    public String sayHello(String content) {
        System.out.println("say hello");
        return "say "+content;
    }

    public String saveUser(User user) {
        return null;
    }
}
