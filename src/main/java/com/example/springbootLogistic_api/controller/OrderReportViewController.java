package com.example.springbootLogistic_api.controller;

import com.example.springbootLogistic_api.entity.OrderReportView;
import com.example.springbootLogistic_api.service.OrderReportViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reports/orders")
public class OrderReportViewController {

    @Autowired
    private OrderReportViewService service;

    @GetMapping
    public List<OrderReportView> getAllOrders() {
        return service.getAllOrders();
    }
}
