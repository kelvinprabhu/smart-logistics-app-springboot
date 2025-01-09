package com.example.springbootLogistic_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "warehouse_inventory_utilization")
public class WarehouseInventoryUtilization {

    @Id
    @Column(name = "warehouse_id")
    private int warehouseId;

    @Column(name = "warehouse_location")
    private String warehouseLocation;

    @Column(name = "warehouse_capacity")
    private Integer warehouseCapacity; // Changed to Integer to handle NULL values

    @Column(name = "current_inventory")
    private Integer currentInventory; // Changed to Integer to handle NULL values

    @Column(name = "utilization_percentage", nullable = true)
    private Double utilizationPercentage; // Nullable for fields with NULL

    // Getters and Setters

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseLocation() {
        return warehouseLocation;
    }

    public void setWarehouseLocation(String warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
    }

    public Integer getWarehouseCapacity() {
        return warehouseCapacity;
    }

    public void setWarehouseCapacity(Integer warehouseCapacity) {
        this.warehouseCapacity = warehouseCapacity;
    }

    public Integer getCurrentInventory() {
        return currentInventory;
    }

    public void setCurrentInventory(Integer currentInventory) {
        this.currentInventory = currentInventory;
    }

    public Double getUtilizationPercentage() {
        return utilizationPercentage;
    }

    public void setUtilizationPercentage(Double utilizationPercentage) {
        this.utilizationPercentage = utilizationPercentage;
    }
}
