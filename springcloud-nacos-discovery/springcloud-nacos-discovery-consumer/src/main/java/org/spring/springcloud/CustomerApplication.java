package org.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Spring Boot 服务启动类
 *
 * Created by bysocket on 21/12/06.
 */
@EnableDiscoveryClient  // Spring Cloud 服务注册与发现标识
@EnableFeignClients     // Spring Cloud 服务消费 Feign 标识
@SpringBootApplication  // Spring Boot 应用标识
public class CustomerApplication {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(CustomerApplication.class,args);
    }
}
