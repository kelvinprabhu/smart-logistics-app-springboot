package com.example.springbootLogistic_api.controller;

import com.example.springbootLogistic_api.entity.ShipmentTracking;
import com.example.springbootLogistic_api.service.ShipmentTracking_Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentTracking_Controller {

    private final ShipmentTracking_Service service;

    public ShipmentTracking_Controller(ShipmentTracking_Service service) {
        this.service = service;
    }

    @GetMapping
    public List<ShipmentTracking> getAllShipments() {
        return service.getAllShipments();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShipmentTracking> getShipmentById(@PathVariable Integer id) {
        Optional<ShipmentTracking> shipment = service.getShipmentById(id);
        return shipment.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ShipmentTracking createShipment(@RequestBody ShipmentTracking shipment) {
        return service.createShipment(shipment);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ShipmentTracking> updateShipment(@PathVariable Integer id,
            @RequestBody ShipmentTracking shipmentDetails) {
        return ResponseEntity.ok(service.updateShipment(id, shipmentDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteShipment(@PathVariable Integer id) {
        service.deleteShipment(id);
        return ResponseEntity.noContent().build();
    }
}
