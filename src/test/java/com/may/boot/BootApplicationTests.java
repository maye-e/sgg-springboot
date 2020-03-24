package com.may.boot;

import com.may.boot.pojo.Lover;
import com.may.boot.pojo.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class BootApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private Person person;

    @Autowired
    private Lover lover;

    @Autowired
    private ApplicationContext ioc;

    @Test
    void testIoc(){
        System.out.println(ioc.containsBean("helloService"));
    }

    @Test
    void contextLoads() {
        System.out.println(person);
        System.err.println(lover);
    }

    @Test
    void testLog(){
        // 日志级别，由低到高
        logger.trace("trace...");
        logger.debug("debug...");
        logger.info("info...");
        logger.warn("warn...");
        logger.error("error...");
    }
}
