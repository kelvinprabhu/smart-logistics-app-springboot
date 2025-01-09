package com.example.springbootLogistic_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_trends_daily")
public class OrderTrendsDaily {

    @Id
    @Column(name = "order_date")
    private String orderDate;

    @Column(name = "total_orders")
    private Long totalOrders;

    @Column(name = "total_quantity")
    private Long totalQuantity;

    // Getters and Setters
    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Long getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(Long totalOrders) {
        this.totalOrders = totalOrders;
    }

    public Long getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Long totalQuantity) {
        this.totalQuantity = totalQuantity;
    }
}
