package com.example.springbootLogistic_api.entity;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "shipment_tracking")
public class ShipmentTracking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "order_id", nullable = false)
    private int orderId; // Foreign key to `orders.id`

    @Column(name = "current_location", nullable = false)
    private String currentLocation;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status; // Enum for shipment status

    @Column(name = "last_updated", nullable = false, insertable = false, updatable = true)
    private Timestamp lastUpdated;

    @Column(name = "created_at", nullable = false, insertable = false, updatable = false)
    private Timestamp createdAt;

    // Enum for shipment status
    public enum Status {
        IN_TRANSIT, DELIVERED, RETURNED
    }

    // Default Constructor
    public ShipmentTracking() {
    }

    // Parameterized Constructor
    public ShipmentTracking(int orderId, String currentLocation, Status status) {
        this.orderId = orderId;
        this.currentLocation = currentLocation;
        this.status = status;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    // Override toString method
    @Override
    public String toString() {
        return "ShipmentTracking{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", currentLocation='" + currentLocation + '\'' +
                ", status=" + status +
                ", lastUpdated=" + lastUpdated +
                ", createdAt=" + createdAt +
                '}';
    }

    // Override equals method
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ShipmentTracking that = (ShipmentTracking) o;
        return id == that.id &&
                orderId == that.orderId &&
                Objects.equals(currentLocation, that.currentLocation) &&
                status == that.status;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, currentLocation, status);
    }
}
