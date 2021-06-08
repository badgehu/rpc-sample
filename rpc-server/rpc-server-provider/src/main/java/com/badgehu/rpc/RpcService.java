package com.badgehu.rpc;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// v0.2 以注解方式对外提供服务
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface RpcService {
    Class<?> value(); // 获取需要发布服务接口
    // 注解增加版本号，兼容
    String version() default "";
}
