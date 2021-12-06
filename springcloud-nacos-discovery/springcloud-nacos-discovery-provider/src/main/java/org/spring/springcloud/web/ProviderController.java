package org.spring.springcloud.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Provider HelloWorld 案例
 * <p>
 * Created by bysocket on 21/12/06.
 */
@RestController
@Slf4j
public class ProviderController {

    @GetMapping("/echo/{something}")
    public String echo(@PathVariable String something) {

        log.info("ProviderController#echo something = " + something);

        return "Hello, Nacos Service Provider echo: " + something;
    }
}