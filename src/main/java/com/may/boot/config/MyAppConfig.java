package com.may.boot.config;

import com.may.boot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 指定当前类是一个配置类，代替 spring 的 xml 配置文件
 */
@Configuration
public class MyAppConfig {

    /**
     * 将方法返回值添加到容器中作为组件，组件默认 id 为该方法名
     * @return
     */
    @Bean
    public HelloService helloService(){
        System.out.println("配置类 @bean 给容器添加组件了...");
        return new HelloService();
    }
}
