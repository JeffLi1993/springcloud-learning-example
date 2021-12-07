package org.spring.springcloud.web;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Config 案例
 * <p>
 * Created by bysocket on 21/12/07.
 */
@RestController
@Slf4j
@RefreshScope
@Data
public class ConfigController {

    @Value("${blog.name}")
    private String blogName;

    @GetMapping("/get")
    public String get() {
        return "ConfigController#get blog name = " + getBlogName();
    }
}