package com.example.springbootLogistic_api.service;

import com.example.springbootLogistic_api.entity.Inventory;
import com.example.springbootLogistic_api.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public Inventory addInventory(Inventory inventory) {
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
