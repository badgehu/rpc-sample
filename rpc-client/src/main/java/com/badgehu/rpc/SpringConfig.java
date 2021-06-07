package com.badgehu.rpc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean(name = "rpcProxyClient")
    public RpcProxyClient rpcProxyClient(){
        return new RpcProxyClient();
    }
}
