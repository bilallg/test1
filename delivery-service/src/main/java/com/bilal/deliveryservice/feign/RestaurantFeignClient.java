package com.bilal.deliveryservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "restaurant-service")
public interface RestaurantFeignClient {
    @GetMapping("/restaurants/{id}")
    Object getRestaurantById(@PathVariable("id") Long id);
}
