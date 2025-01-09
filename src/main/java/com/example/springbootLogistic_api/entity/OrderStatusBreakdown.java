package com.example.springbootLogistic_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_status_breakdown")
public class OrderStatusBreakdown {

    @Id
    @Column(name = "status", nullable = false, length = 255)
    private String status; // Ensure it's non-nullable if 'status' is unique/primary key

    @Column(name = "total_orders", nullable = true)
    private Long totalOrders; // Handle NULL values gracefully

    // Getters and Setters

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(Long totalOrders) {
        this.totalOrders = totalOrders;
    }
}
