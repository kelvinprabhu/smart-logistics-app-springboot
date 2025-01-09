package com.example.springbootLogistic_api.repository;

import com.example.springbootLogistic_api.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

// Replace EntityName with Customer, Order, Inventory, ShipmentTracking
public interface OrderRepository extends JpaRepository<Order, Integer> {
    // List<Order> findByWarehouseId(Long warehouseId);
}