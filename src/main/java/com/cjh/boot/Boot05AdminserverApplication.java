package com.cjh.boot;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class Boot05AdminserverApplication {

    public static void main(String[] args) {
        System.out.println("项目启动了0");
        System.out.println("项目启动了1");
        System.out.println("项目启动了2");
        System.out.println("master test");
        System.out.println("hot-fix test");
        System.out.println("push test");
        System.out.println("pull test");
        SpringApplication.run(Boot05AdminserverApplication.class, args);
    }

}
