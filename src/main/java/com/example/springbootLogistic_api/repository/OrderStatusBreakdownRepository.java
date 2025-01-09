package com.example.springbootLogistic_api.repository;

import com.example.springbootLogistic_api.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderStatusBreakdownRepository extends JpaRepository<OrderStatusBreakdown, String> {
}
