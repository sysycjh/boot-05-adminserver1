package com.cjh.boot;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class Boot05AdminserverApplication {

    public static void main(String[] args) {
        System.out.println("项目启动了");
        SpringApplication.run(Boot05AdminserverApplication.class, args);
    }

}
