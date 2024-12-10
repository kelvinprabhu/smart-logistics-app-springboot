package com.example.springbootLogistic_api.controller;

import com.example.springbootLogistic_api.entity.ShipmentTracking;
import com.example.springbootLogistic_api.service.ShipmentTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shipment-tracking")
public class ShipmentTrackingController {

    @Autowired
    private ShipmentTrackingService shipmentTrackingService;

    // Create a new shipment tracking record
    @PostMapping
    public ResponseEntity<ShipmentTracking> createShipmentTracking(@RequestBody ShipmentTracking shipmentTracking) {
        ShipmentTracking createdShipmentTracking = shipmentTrackingService.createShipmentTracking(shipmentTracking);
        return ResponseEntity.ok(createdShipmentTracking);
    }

    // Get all shipment tracking records
    @GetMapping
    public ResponseEntity<List<ShipmentTracking>> getAllShipmentTrackings() {
        List<ShipmentTracking> shipmentTrackings = shipmentTrackingService.getAllShipmentTrackings();
        return ResponseEntity.ok(shipmentTrackings);
    }

    // Get a shipment tracking record by ID
    @GetMapping("/{id}")
    public ResponseEntity<ShipmentTracking> getShipmentTrackingById(@PathVariable int id) {
        ShipmentTracking shipmentTracking = shipmentTrackingService.getShipmentTrackingById(id);
        return ResponseEntity.ok(shipmentTracking);
    }

    // Update a shipment tracking record
    @PutMapping("/{id}")
    public ResponseEntity<ShipmentTracking> updateShipmentTracking(
            @PathVariable int id, @RequestBody ShipmentTracking updatedShipmentTracking) {
        ShipmentTracking shipmentTracking = shipmentTrackingService.updateShipmentTracking(id, updatedShipmentTracking);
        return ResponseEntity.ok(shipmentTracking);
    }

    // Delete a shipment tracking record
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteShipmentTracking(@PathVariable int id) {
        shipmentTrackingService.deleteShipmentTracking(id);
        return ResponseEntity.ok("ShipmentTracking with ID " + id + " deleted successfully.");
    }
}
