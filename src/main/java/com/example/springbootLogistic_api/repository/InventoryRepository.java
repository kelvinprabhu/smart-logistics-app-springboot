package com.example.springbootLogistic_api.repository;

import com.example.springbootLogistic_api.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
    List<Inventory> findByWarehouseId(int warehouseId);
}
