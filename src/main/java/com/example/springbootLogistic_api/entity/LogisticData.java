package com.example.springbootLogistic_api.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "logistic_data")
public class LogisticData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String location;
    private int totalCapacity;
    private int currentInventory;

    @Column(name = "created_at", updatable = false, insertable = false)
    private LocalDateTime createdAt;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getCurrentInventory() {
        return currentInventory;
    }

    public void setCurrentInventory(int currentInventory) {
        this.currentInventory = currentInventory;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
