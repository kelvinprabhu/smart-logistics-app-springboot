package com.example.springbootLogistic_api.controller;

import com.example.springbootLogistic_api.entity.*;
import com.example.springbootLogistic_api.service.AnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {

    @Autowired
    private AnalyticsService analyticsService;

    @GetMapping("/order-status")
    public List<OrderStatusBreakdown> getOrderStatusBreakdown() {
        return analyticsService.getOrderStatusBreakdown();
    }

    @GetMapping("/warehouse-utilization")
    public List<WarehouseInventoryUtilization> getWarehouseInventoryUtilization() {
        return analyticsService.getWarehouseInventoryUtilization();
    }

    @GetMapping("/delivery-performance")
    public List<DeliveryAgentPerformance> getDeliveryAgentPerformance() {
        return analyticsService.getDeliveryAgentPerformance();
    }

    @GetMapping("/customer-frequency")
    public List<CustomerOrderFrequency> getCustomerOrderFrequency() {
        return analyticsService.getCustomerOrderFrequency();
    }

    @GetMapping("/order-trends")
    public List<OrderTrendsDaily> getOrderTrendsDaily() {
        return analyticsService.getOrderTrendsDaily();
    }
}
