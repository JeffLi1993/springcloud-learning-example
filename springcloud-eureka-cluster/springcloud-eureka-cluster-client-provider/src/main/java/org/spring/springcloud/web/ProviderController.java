package org.spring.springcloud.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Provider HelloWorld 案例
 * <p>
 * Created by bysocket on 06/22/17.
 */
@RestController
public class ProviderController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProviderController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private Registration registration;

    @RequestMapping("/provider")
    public String provider() {
        ServiceInstance instance = serviceInstance();
        LOGGER.info("provider service, host = " + instance.getHost()
                + ", service_id = " + instance.getServiceId());
        return "Hello,Provider!";
    }

    public ServiceInstance serviceInstance() {
        List<ServiceInstance> list = discoveryClient.getInstances(registration.getServiceId());
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}