package com.example.springbootLogistic_api.repository;

import com.example.springbootLogistic_api.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {

}
