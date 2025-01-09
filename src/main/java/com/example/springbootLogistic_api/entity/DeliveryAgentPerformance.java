package com.example.springbootLogistic_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "delivery_agent_performance")
public class DeliveryAgentPerformance {

    @Id
    @Column(name = "agent_id", nullable = false)
    private Integer agentId;

    @Column(name = "delivery_agent_name", nullable = true, length = 255)
    private String agentName; // Nullable in case some agents have no names

    @Column(name = "total_orders_handled", nullable = true)
    private Long totalOrdersHandled; // Handle NULL for zero-order agents

    // Getters and Setters

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public Long getTotalOrdersHandled() {
        return totalOrdersHandled;
    }

    public void setTotalOrdersHandled(Long totalOrdersHandled) {
        this.totalOrdersHandled = totalOrdersHandled;
    }
}
