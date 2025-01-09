package com.example.springbootLogistic_api.controller;

import com.example.springbootLogistic_api.entity.Shipment;
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
    public ResponseEntity<Shipment> createShipmentTracking(@RequestBody Shipment shipmentTracking) {
        Shipment createdShipmentTracking = shipmentTrackingService.createShipmentTracking(shipmentTracking);
        return ResponseEntity.ok(createdShipmentTracking);
    }

    // Get all shipment tracking records
    @GetMapping
    public ResponseEntity<List<Shipment>> getAllShipmentTrackings() {
        List<Shipment> shipmentTrackings = shipmentTrackingService.getAllShipmentTrackings();
        return ResponseEntity.ok(shipmentTrackings);
    }

    // Get a shipment tracking record by ID
    @GetMapping("/{id}")
    public ResponseEntity<Shipment> getShipmentTrackingById(@PathVariable int id) {
        Shipment shipmentTracking = shipmentTrackingService.getShipmentTrackingById(id);
        return ResponseEntity.ok(shipmentTracking);
    }

    // Update a shipment tracking record
    @PutMapping("/{id}")
    public ResponseEntity<Shipment> updateShipmentTracking(
            @PathVariable int id, @RequestBody Shipment updatedShipmentTracking) {
        Shipment shipmentTracking = shipmentTrackingService.updateShipmentTracking(id, updatedShipmentTracking);
        return ResponseEntity.ok(shipmentTracking);
    }

    // Delete a shipment tracking record
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteShipmentTracking(@PathVariable int id) {
        shipmentTrackingService.deleteShipmentTracking(id);
        return ResponseEntity.ok("ShipmentTracking with ID " + id + " deleted successfully.");
    }
}
