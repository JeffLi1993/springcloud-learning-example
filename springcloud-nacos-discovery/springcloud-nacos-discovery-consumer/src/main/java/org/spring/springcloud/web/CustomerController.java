package org.spring.springcloud.web;

import org.spring.springcloud.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Customer HelloWorld 案例
 * <p>
 * Created by bysocket on 21/12/06.
 */
@RestController
public class CustomerController {

    @Autowired
    private ProviderClient providerClient;

    @GetMapping("/test")
    public String test() {

        // 调用 provider-service 服务
        String result = providerClient.echo("Good!");

        return "CustomerController#test result = " + result;
    }
}