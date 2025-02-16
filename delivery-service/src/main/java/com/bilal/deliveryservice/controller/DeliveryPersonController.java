package com.bilal.deliveryservice.controller;

import com.bilal.deliveryservice.entity.DeliveryPerson;
import com.bilal.deliveryservice.service.DeliveryPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/delivery-persons")
public class DeliveryPersonController {

    @Autowired
    private DeliveryPersonService deliveryPersonService;

    @GetMapping
    public List<DeliveryPerson> getAllDeliveryPersons() {
        return deliveryPersonService.getAllDeliveryPersons();
    }

    @GetMapping("/{id}")
    public DeliveryPerson getDeliveryPersonById(@PathVariable Long id) {
        return deliveryPersonService.getDeliveryPersonById(id);
    }

    @PostMapping
    public DeliveryPerson createDeliveryPerson(@RequestBody DeliveryPerson deliveryPerson) {
        return deliveryPersonService.createDeliveryPerson(deliveryPerson);
    }

    @DeleteMapping("/{id}")
    public void deleteDeliveryPerson(@PathVariable Long id) {
        deliveryPersonService.deleteDeliveryPerson(id);
    }
}
