package com.bilal.deliveryservice.repository;

import com.bilal.deliveryservice.entity.DeliveryPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryPersonRepository extends JpaRepository<DeliveryPerson, Long> {
}
