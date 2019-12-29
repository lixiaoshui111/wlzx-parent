package net.wanho.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WlzxEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WlzxEurekaServerApplication.class, args);
    }

}
