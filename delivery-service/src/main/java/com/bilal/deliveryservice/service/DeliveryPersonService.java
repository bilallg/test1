package com.bilal.deliveryservice.service;

import com.bilal.deliveryservice.entity.DeliveryPerson;
import com.bilal.deliveryservice.exception.ResourceNotFoundException;
import com.bilal.deliveryservice.repository.DeliveryPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryPersonService {

    @Autowired
    private DeliveryPersonRepository deliveryPersonRepository;

    public List<DeliveryPerson> getAllDeliveryPersons() {
        return deliveryPersonRepository.findAll();
    }

    public DeliveryPerson getDeliveryPersonById(Long id) {
        return deliveryPersonRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Delivery person not found with ID: " + id));
    }

    public DeliveryPerson createDeliveryPerson(DeliveryPerson deliveryPerson) {
        return deliveryPersonRepository.save(deliveryPerson);
    }

    public void deleteDeliveryPerson(Long id) {
        DeliveryPerson deliveryPerson = getDeliveryPersonById(id);
        deliveryPersonRepository.delete(deliveryPerson);
    }
}
