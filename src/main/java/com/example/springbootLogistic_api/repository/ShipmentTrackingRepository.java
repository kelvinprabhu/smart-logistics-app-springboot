package com.example.springbootLogistic_api.repository;

import com.example.springbootLogistic_api.entity.ShipmentTracking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentTrackingRepository extends JpaRepository<ShipmentTracking, Integer> {
}