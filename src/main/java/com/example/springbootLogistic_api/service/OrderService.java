package com.example.springbootLogistic_api.service;

import com.example.springbootLogistic_api.entity.Order;
import com.example.springbootLogistic_api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(int id) {
        return orderRepository.findById(id);
    }

    public Order updateOrder(int id, Order orderDetails) {
        return orderRepository.findById(id).map(order -> {
            order.setStatus(orderDetails.getStatus());
            order.setDeliveryDate(orderDetails.getDeliveryDate());
            order.setQuantity(orderDetails.getQuantity());
            return orderRepository.save(order);
        }).orElse(null);
    }

    public boolean deleteOrder(int id) {
        if (orderRepository.existsById(id)) {
            orderRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
