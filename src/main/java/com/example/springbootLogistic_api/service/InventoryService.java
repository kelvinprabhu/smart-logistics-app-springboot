package com.example.springbootLogistic_api.service;

import com.example.springbootLogistic_api.entity.Inventory;
import com.example.springbootLogistic_api.entity.Warehouse;
import com.example.springbootLogistic_api.repository.InventoryRepository;
import com.example.springbootLogistic_api.repository.WarehouseRepository;

import jakarta.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;
    @Autowired
    private WarehouseRepository warehouseRepository;

    public Inventory addInventory(Inventory inventory) {
        // Fetch the warehouse from the database
        Warehouse warehouse = warehouseRepository.findById(inventory.getWarehouse().getId().intValue())
                .orElseThrow(() -> new EntityNotFoundException(
                        "Warehouse not found with ID: " + inventory.getWarehouse().getId()));

        // Set the warehouse to the inventory
        inventory.setWarehouse(warehouse);

        // Save the inventory
        return inventoryRepository.save(inventory);
    }

    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    public Inventory getInventoryById(int id) {
        return inventoryRepository.findById(id).orElse(null);
    }

    public List<Inventory> getInventoryByWarehouse(int warehouseId) {
        return inventoryRepository.findByWarehouseId(warehouseId);
    }

    public Inventory updateInventory(int id, Inventory inventoryDetails) {
        Inventory inventory = inventoryRepository.findById(id).orElse(null);
        if (inventory != null) {
            inventory.setWarehouse(inventoryDetails.getWarehouse());
            inventory.setProductName(inventoryDetails.getProductName());
            inventory.setQuantity(inventoryDetails.getQuantity());
            inventory.setMinThreshold(inventoryDetails.getMinThreshold());
            return inventoryRepository.save(inventory);
        }
        return null;
    }

    public void deleteInventory(int id) {
        inventoryRepository.deleteById(id);
    }
}
