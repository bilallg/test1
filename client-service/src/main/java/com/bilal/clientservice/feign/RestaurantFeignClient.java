package com.bilal.clientservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "restaurant-service")
public interface RestaurantFeignClient {

    @GetMapping("/restaurants")
    Object getAllRestaurants();

    @GetMapping("/menus/restaurant/{restaurantId}")
    Object getMenuByRestaurant(@PathVariable("restaurantId") Long restaurantId);
}
