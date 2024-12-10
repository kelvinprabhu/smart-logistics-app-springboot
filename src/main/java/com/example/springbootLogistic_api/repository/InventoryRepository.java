package com.example.springbootLogistic_api.repository;

import com.example.springbootLogistic_api.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

// Replace EntityName with Customer, Order, Inventory, ShipmentTracking
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
}