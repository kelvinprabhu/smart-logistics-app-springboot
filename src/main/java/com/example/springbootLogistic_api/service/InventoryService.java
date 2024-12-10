package com.example.springbootLogistic_api.service;

import com.example.springbootLogistic_api.entity.Inventory;
import com.example.springbootLogistic_api.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public Inventory createInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    public Optional<Inventory> getInventoryById(int id) {
        return inventoryRepository.findById(id);
    }

    public Inventory updateInventory(int id, Inventory inventoryDetails) {
        return inventoryRepository.findById(id).map(inventory -> {
            inventory.setProductName(inventoryDetails.getProductName());
            inventory.setQuantity(inventoryDetails.getQuantity());
            inventory.setMinThreshold(inventoryDetails.getMinThreshold());
            return inventoryRepository.save(inventory);
        }).orElse(null);
    }

    public boolean deleteInventory(int id) {
        if (inventoryRepository.existsById(id)) {
            inventoryRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
