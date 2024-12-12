package com.example.springbootLogistic_api.repository;

import com.example.springbootLogistic_api.entity.DeliveryAgent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryAgentRepository extends JpaRepository<DeliveryAgent, Integer> {
}
