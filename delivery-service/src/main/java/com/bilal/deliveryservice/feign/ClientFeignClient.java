package com.bilal.deliveryservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "client-service")
public interface ClientFeignClient {
    @GetMapping("/clients/{id}")
    Object getClientById(@PathVariable("id") Long id);
}
