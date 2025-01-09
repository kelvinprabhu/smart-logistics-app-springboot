package com.example.springbootLogistic_api.repository;

import com.example.springbootLogistic_api.entity.OrderReportView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderReportViewRepository extends JpaRepository<OrderReportView, Integer> {
}
