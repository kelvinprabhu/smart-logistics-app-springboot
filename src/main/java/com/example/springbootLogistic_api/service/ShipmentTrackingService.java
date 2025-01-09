package com.example.springbootLogistic_api.service;

import com.example.springbootLogistic_api.entity.Shipment;
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
    public Shipment createShipmentTracking(Shipment shipmentTracking) {
        return shipmentTrackingRepository.save(shipmentTracking);
    }

    // Get all shipment tracking records
    public List<Shipment> getAllShipmentTrackings() {
        return shipmentTrackingRepository.findAll();
    }

    // Get a shipment tracking record by ID
    public Shipment getShipmentTrackingById(int id) {
        Optional<Shipment> shipmentTracking = shipmentTrackingRepository.findById(id);
        return shipmentTracking
                .orElseThrow(() -> new RuntimeException("ShipmentTracking with ID " + id + " not found"));
    }

    // Update a shipment tracking record
    public Shipment updateShipmentTracking(int id, Shipment updatedShipmentTracking) {
        Shipment existingShipmentTracking = getShipmentTrackingById(id);
        existingShipmentTracking.setOrderId(updatedShipmentTracking.getOrderId());
        existingShipmentTracking.setCurrentLocation(updatedShipmentTracking.getCurrentLocation());
        existingShipmentTracking.setStatus(updatedShipmentTracking.getStatus());
        existingShipmentTracking.setLastUpdated(updatedShipmentTracking.getLastUpdated());
        return shipmentTrackingRepository.save(existingShipmentTracking);
    }

    // Delete a shipment tracking record
    public void deleteShipmentTracking(int id) {
        Shipment existingShipmentTracking = getShipmentTrackingById(id);
        shipmentTrackingRepository.delete(existingShipmentTracking);
    }
}
