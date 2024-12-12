package com.example.springbootLogistic_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "delivery_schedule")
public class DeliverySchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int scheduleId;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false) // Renamed id to order_id for clarity
    private Order order;

    @ManyToOne
    @JoinColumn(name = "agent_id", nullable = false)
    private DeliveryAgent agent;

    @Column(nullable = false)
    private String expectedDeliveryDate;

    @Column(nullable = false)
    private String status = "Pending"; // Setting default status to 'Pending'

    // Getters and Setters
    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public DeliveryAgent getAgent() {
        return agent;
    }

    public void setAgent(DeliveryAgent agent) {
        this.agent = agent;
    }

    public String getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(String expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
