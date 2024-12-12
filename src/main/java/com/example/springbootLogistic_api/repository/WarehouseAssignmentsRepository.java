package com.example.springbootLogistic_api.repository;

import com.example.springbootLogistic_api.entity.WarehouseAssignments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseAssignmentsRepository extends JpaRepository<WarehouseAssignments, Integer> {
}
