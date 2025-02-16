package com.bilal.restaurantservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "delivery-service")
public interface DeliveryFeignClient {
    @GetMapping("/deliveries/{id}")
    Object getDeliveryById(@PathVariable("id") Long id);
}
