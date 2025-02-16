package com.bilal.deliveryservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long clientId;
    private Long restaurantId;
    private Long deliveryPersonId;
    private String status; // Example: "Pending", "In Progress", "Delivered"

    private LocalDateTime createdAt = LocalDateTime.now();

    public Order(long l, long l1, long l2, long l3, String pending) {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
