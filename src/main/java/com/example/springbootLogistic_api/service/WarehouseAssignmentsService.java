package com.example.springbootLogistic_api.service;

import com.example.springbootLogistic_api.entity.WarehouseAssignments;
import com.example.springbootLogistic_api.repository.WarehouseAssignmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseAssignmentsService {

    @Autowired
    private WarehouseAssignmentsRepository warehouseAssignmentsRepository;

    public WarehouseAssignments addAssignment(WarehouseAssignments assignment) {
        return warehouseAssignmentsRepository.save(assignment);
    }

    public List<WarehouseAssignments> getAllAssignments() {
        return warehouseAssignmentsRepository.findAll();
    }

    public WarehouseAssignments getAssignmentById(int id) {
        return warehouseAssignmentsRepository.findById(id).orElse(null);
    }

    public WarehouseAssignments updateAssignment(int id, WarehouseAssignments assignmentDetails) {
        WarehouseAssignments assignment = warehouseAssignmentsRepository.findById(id).orElse(null);
        if (assignment != null) {
            assignment.setOrder(assignmentDetails.getOrder());
            assignment.setWarehouse(assignmentDetails.getWarehouse());
            return warehouseAssignmentsRepository.save(assignment);
        }
        return null;
    }

    public void deleteAssignment(int id) {
        warehouseAssignmentsRepository.deleteById(id);
    }
}
