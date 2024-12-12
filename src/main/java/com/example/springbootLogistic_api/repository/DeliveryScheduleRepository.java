package com.example.springbootLogistic_api.repository;

import com.example.springbootLogistic_api.entity.DeliverySchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryScheduleRepository extends JpaRepository<DeliverySchedule, Integer> {
}
