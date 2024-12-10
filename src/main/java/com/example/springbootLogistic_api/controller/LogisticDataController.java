package com.example.springbootLogistic_api.controller;

import com.example.springbootLogistic_api.entity.LogisticData;
import com.example.springbootLogistic_api.service.LogisticDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logistics")
public class LogisticDataController {
    @Autowired
    private LogisticDataService service;

    // Create
    @PostMapping
    public LogisticData createLogisticData(@RequestBody LogisticData logisticData) {
        return service.saveLogisticData(logisticData);
    }

    // Read All
    @GetMapping
    public List<LogisticData> getAllLogisticData() {
        return service.getAllLogisticData();
    }

    // Read by ID
    @GetMapping("/{id}")
    public ResponseEntity<LogisticData> getLogisticDataById(@PathVariable int id) {
        LogisticData logisticData = service.getLogisticDataById(id);
        return logisticData != null ? ResponseEntity.ok(logisticData) : ResponseEntity.notFound().build();
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<LogisticData> updateLogisticData(@PathVariable int id,
            @RequestBody LogisticData updatedData) {
        LogisticData existingData = service.getLogisticDataById(id);
        if (existingData != null) {
            existingData.setName(updatedData.getName());
            existingData.setLocation(updatedData.getLocation());
            existingData.setTotalCapacity(updatedData.getTotalCapacity());
            existingData.setCurrentInventory(updatedData.getCurrentInventory());
            return ResponseEntity.ok(service.saveLogisticData(existingData));
        }
        return ResponseEntity.notFound().build();
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLogisticData(@PathVariable int id) {
        service.deleteLogisticData(id);
        return ResponseEntity.noContent().build();
    }
}
