package com.example.springbootLogistic_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

@Entity
@Table(name = "customer_order_frequency")
public class CustomerOrderFrequency {

    @Id
    @Column(name = "customer_id", nullable = false)
    private Integer customerId;

    @Column(name = "customer_name", nullable = false, length = 255)
    private String customerName;

    @Column(name = "total_orders", nullable = false)
    private Long totalOrders;

    // Getters and Setters
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(Long totalOrders) {
        this.totalOrders = totalOrders;
    }

    @Override
    public String toString() {
        return "CustomerOrderFrequency{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", totalOrders=" + totalOrders +
                '}';
    }
}
