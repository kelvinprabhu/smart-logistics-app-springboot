package com.example.springbootLogistic_api.service;

import com.example.springbootLogistic_api.entity.ShipmentTracking;
import com.example.springbootLogistic_api.repository.ShipmentTrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipmentTrackingService {

    @Autowired
    private ShipmentTrackingRepository shipmentTrackingRepository;

    // Create a new shipment tracking record
    public ShipmentTracking createShipmentTracking(ShipmentTracking shipmentTracking) {
        return shipmentTrackingRepository.save(shipmentTracking);
    }

    // Get all shipment tracking records
    public List<ShipmentTracking> getAllShipmentTrackings() {
        return shipmentTrackingRepository.findAll();
    }

    // Get a shipment tracking record by ID
    public ShipmentTracking getShipmentTrackingById(int id) {
        Optional<ShipmentTracking> shipmentTracking = shipmentTrackingRepository.findById(id);
        return shipmentTracking
                .orElseThrow(() -> new RuntimeException("ShipmentTracking with ID " + id + " not found"));
    }

    // Update a shipment tracking record
    public ShipmentTracking updateShipmentTracking(int id, ShipmentTracking updatedShipmentTracking) {
        ShipmentTracking existingShipmentTracking = getShipmentTrackingById(id);
        existingShipmentTracking.setOrderId(updatedShipmentTracking.getOrderId());
        existingShipmentTracking.setCurrentLocation(updatedShipmentTracking.getCurrentLocation());
        existingShipmentTracking.setStatus(updatedShipmentTracking.getStatus());
        existingShipmentTracking.setLastUpdated(updatedShipmentTracking.getLastUpdated());
        return shipmentTrackingRepository.save(existingShipmentTracking);
    }

    // Delete a shipment tracking record
    public void deleteShipmentTracking(int id) {
        ShipmentTracking existingShipmentTracking = getShipmentTrackingById(id);
        shipmentTrackingRepository.delete(existingShipmentTracking);
    }
}
