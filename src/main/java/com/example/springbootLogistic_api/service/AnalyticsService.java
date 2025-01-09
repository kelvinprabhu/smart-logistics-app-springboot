package com.example.springbootLogistic_api.service;

import com.example.springbootLogistic_api.entity.*;
import com.example.springbootLogistic_api.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalyticsService {

    @Autowired
    private OrderStatusBreakdownRepository orderStatusBreakdownRepository;

    @Autowired
    private WarehouseInventoryUtilizationRepository warehouseInventoryUtilizationRepository;

    @Autowired
    private DeliveryAgentPerformanceRepository deliveryAgentPerformanceRepository;

    @Autowired
    private CustomerOrderFrequencyRepository customerOrderFrequencyRepository;

    @Autowired
    private OrderTrendsDailyRepository orderTrendsDailyRepository;

    public List<OrderStatusBreakdown> getOrderStatusBreakdown() {
        return orderStatusBreakdownRepository.findAll();
    }

    public List<WarehouseInventoryUtilization> getWarehouseInventoryUtilization() {
        return warehouseInventoryUtilizationRepository.findAll();
    }

    public List<DeliveryAgentPerformance> getDeliveryAgentPerformance() {
        return deliveryAgentPerformanceRepository.findAll();
    }

    public List<CustomerOrderFrequency> getCustomerOrderFrequency() {
        return customerOrderFrequencyRepository.findAll();
    }

    public List<OrderTrendsDaily> getOrderTrendsDaily() {
        List<OrderTrendsDaily> results = orderTrendsDailyRepository.findAll();
        System.out.println(results); // Debug the output here
        return results;
    }
}
