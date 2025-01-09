package com.example.springbootLogistic_api.repository;

import com.example.springbootLogistic_api.entity.ShipmentTracking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentTracking_Repository extends JpaRepository<ShipmentTracking, Integer> {
}