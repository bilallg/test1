package com.bilal.deliveryservice.config;

import com.bilal.deliveryservice.entity.DeliveryPerson;
import com.bilal.deliveryservice.entity.Order;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class DataInitializer {

    @PostConstruct
    public void initData() {
        // Sample data for DeliveryPerson
        List<DeliveryPerson> deliveryPeople = List.of(
                new DeliveryPerson(1L, "John Doe", "1234567890", "john@example.com", "Bike"),
                new DeliveryPerson(2L, "Jane Smith", "0987654321", "jane@example.com", "Car")
        );

        // Sample data for Orders
        List<Order> orders = List.of(
                new Order(1L, 101L, 201L, 1L, "Pending"),
                new Order(2L, 102L, 202L, 2L, "In Progress")
        );
    }
}
