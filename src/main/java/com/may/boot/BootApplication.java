package com.may.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication 注解，标注主程序，说明这是一个 springboot应用
 */
//@ImportResource(locations = {"classpath:beans.xml"})// 加载spring配置文件，支持多个
@SpringBootApplication
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

}
