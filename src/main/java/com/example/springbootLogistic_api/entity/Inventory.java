package com.example.springbootLogistic_api.entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "warehouse_id", nullable = false)
    private LogisticData warehouse; // Refers to `logistic_data`

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(nullable = false)
    private int quantity;

    @Column(name = "min_threshold", nullable = false)
    private int minThreshold;

    @Column(name = "created_at", updatable = false, insertable = false)
    private Timestamp createdAt;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LogisticData getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(LogisticData warehouse) {
        this.warehouse = warehouse;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMinThreshold() {
        return minThreshold;
    }

    public void setMinThreshold(int minThreshold) {
        this.minThreshold = minThreshold;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
