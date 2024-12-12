package com.example.springbootLogistic_api.service;

import com.example.springbootLogistic_api.entity.Warehouse;
import com.example.springbootLogistic_api.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {

    @Autowired
    private WarehouseRepository warehouseRepository;

    public Warehouse addWarehouse(Warehouse warehouse) {
        return warehouseRepository.save(warehouse);
    }

    public List<Warehouse> getAllWarehouses() {
        return warehouseRepository.findAll();
    }

    public Warehouse getWarehouseById(int id) {
        return warehouseRepository.findById(id).orElse(null);
    }

    public Warehouse updateWarehouse(int id, Warehouse warehouseDetails) {
        Warehouse warehouse = warehouseRepository.findById(id).orElse(null);
        if (warehouse != null) {
            warehouse.setLocation(warehouseDetails.getLocation());
            warehouse.setCapacity(warehouseDetails.getCapacity());
            warehouse.setCurrentInventory(warehouseDetails.getCurrentInventory());
            return warehouseRepository.save(warehouse);
        }
        return null;
    }

    public void deleteWarehouse(int id) {
        warehouseRepository.deleteById(id);
    }
}
