package com.example.springbootLogistic_api.service;

import com.example.springbootLogistic_api.entity.ShipmentTracking;
import com.example.springbootLogistic_api.repository.ShipmentTracking_Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ShipmentTracking_Service {

    private final ShipmentTracking_Repository repository;

    public ShipmentTracking_Service(ShipmentTracking_Repository repository) {
        this.repository = repository;
    }

    public List<ShipmentTracking> getAllShipments() {
        return repository.findAll();
    }

    public Optional<ShipmentTracking> getShipmentById(Integer id) {
        return repository.findById(id);
    }

    public ShipmentTracking createShipment(ShipmentTracking shipment) {
        return repository.save(shipment);
    }

    public ShipmentTracking updateShipment(Integer id, ShipmentTracking shipmentDetails) {
        ShipmentTracking shipment = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Shipment not found"));

        shipment.setShipmentStatus(shipmentDetails.getShipmentStatus());
        shipment.setExpectedDeliveryDate(shipmentDetails.getExpectedDeliveryDate());
        shipment.setActualDeliveryDate(shipmentDetails.getActualDeliveryDate());
        shipment.setCarrier(shipmentDetails.getCarrier());

        return repository.save(shipment);
    }

    public void deleteShipment(Integer id) {
        repository.deleteById(id);
    }
}