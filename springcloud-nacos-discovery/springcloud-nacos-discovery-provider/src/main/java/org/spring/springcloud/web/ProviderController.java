package org.spring.springcloud.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Provider HelloWorld 案例
 * <p>
 * Created by bysocket on 21/12/06.
 */
@RestController
public class ProviderController {

    @GetMapping("/echo/{something}")
    public String echo(@PathVariable String something) {

        return "Hello, Nacos Service Provider echo: " + something;
    }
}