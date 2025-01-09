package com.example.springbootLogistic_api.service;

import com.example.springbootLogistic_api.entity.OrderReportView;
import com.example.springbootLogistic_api.repository.OrderReportViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderReportViewService {

    @Autowired
    private OrderReportViewRepository repository;

    public List<OrderReportView> getAllOrders() {
        return repository.findAll();
    }
}