package com.example.springbootLogistic_api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "warehouse") // Explicitly map to the database table
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "warehouse_id") // Map the database column explicitly
    private Long id;

    @NotNull
    @Column(name = "location", nullable = false) // Ensure the location cannot be null
    private String location;

    @Positive
    @Column(name = "capacity", nullable = false) // Ensure capacity is positive and not null
    private int capacity;

    @Positive
    @Column(name = "current_inventory", nullable = false) // Ensure inventory is positive
    private int currentInventory;

    // No-argument constructor (required by JPA)
    public Warehouse() {
    }

    // All-argument constructor (optional)
    public Warehouse(Long id, String location, int capacity, int currentInventory) {
        this.id = id;
        this.location = location;
        this.capacity = capacity;
        this.currentInventory = currentInventory;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentInventory() {
        return currentInventory;
    }

    public void setCurrentInventory(int currentInventory) {
        this.currentInventory = currentInventory;
    }

    // Override toString for debugging
    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                ", currentInventory=" + currentInventory +
                '}';
    }
}
