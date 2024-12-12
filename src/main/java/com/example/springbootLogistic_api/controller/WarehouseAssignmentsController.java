package com.example.springbootLogistic_api.controller;

import com.example.springbootLogistic_api.entity.WarehouseAssignments;
import com.example.springbootLogistic_api.service.WarehouseAssignmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/warehouse_assignments")
public class WarehouseAssignmentsController {

    @Autowired
    private WarehouseAssignmentsService warehouseAssignmentsService;

    @PostMapping
    public ResponseEntity<WarehouseAssignments> addAssignment(@RequestBody WarehouseAssignments assignment) {
        WarehouseAssignments newAssignment = warehouseAssignmentsService.addAssignment(assignment);
        return ResponseEntity.ok(newAssignment);
    }

    @GetMapping
    public ResponseEntity<List<WarehouseAssignments>> getAllAssignments() {
        List<WarehouseAssignments> assignments = warehouseAssignmentsService.getAllAssignments();
        return ResponseEntity.ok(assignments);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WarehouseAssignments> getAssignmentById(@PathVariable int id) {
        WarehouseAssignments assignment = warehouseAssignmentsService.getAssignmentById(id);
        if (assignment != null) {
            return ResponseEntity.ok(assignment);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<WarehouseAssignments> updateAssignment(@PathVariable int id,
            @RequestBody WarehouseAssignments assignmentDetails) {
        WarehouseAssignments updatedAssignment = warehouseAssignmentsService.updateAssignment(id, assignmentDetails);
        if (updatedAssignment != null) {
            return ResponseEntity.ok(updatedAssignment);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAssignment(@PathVariable int id) {
        warehouseAssignmentsService.deleteAssignment(id);
        return ResponseEntity.noContent().build();
    }
}
