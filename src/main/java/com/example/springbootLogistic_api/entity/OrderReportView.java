package com.example.springbootLogistic_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_report_view")
public class OrderReportView {

    @Id
    @Column(name = "order_id")
    private int orderId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_email")
    private String customerEmail;

    @Column(name = "customer_phone")
    private String customerPhone;

    @Column(name = "customer_address")
    private String customerAddress;

    @Column(name = "order_status")
    private String orderStatus;

    @Column(name = "order_date")
    private String orderDate; // Use LocalDateTime if preferred for date handling

    @Column(name = "delivery_date")
    private String deliveryDate; // Use LocalDate if preferred

    @Column(name = "order_quantity")
    private int orderQuantity;

    @Column(name = "warehouse_location")
    private String warehouseLocation;

    @Column(name = "warehouse_capacity")
    private int warehouseCapacity;

    @Column(name = "warehouse_current_inventory")
    private int warehouseCurrentInventory;

    @Column(name = "delivery_agent_name", nullable = true)
    private String deliveryAgentName;

    @Column(name = "delivery_agent_phone", nullable = true)
    private String deliveryAgentPhone;

    @Column(name = "delivery_agent_route", nullable = true)
    private String deliveryAgentRoute;

    // Getters and Setters

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getWarehouseLocation() {
        return warehouseLocation;
    }

    public void setWarehouseLocation(String warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
    }

    public int getWarehouseCapacity() {
        return warehouseCapacity;
    }

    public void setWarehouseCapacity(int warehouseCapacity) {
        this.warehouseCapacity = warehouseCapacity;
    }

    public int getWarehouseCurrentInventory() {
        return warehouseCurrentInventory;
    }

    public void setWarehouseCurrentInventory(int warehouseCurrentInventory) {
        this.warehouseCurrentInventory = warehouseCurrentInventory;
    }

    public String getDeliveryAgentName() {
        return deliveryAgentName;
    }

    public void setDeliveryAgentName(String deliveryAgentName) {
        this.deliveryAgentName = deliveryAgentName;
    }

    public String getDeliveryAgentPhone() {
        return deliveryAgentPhone;
    }

    public void setDeliveryAgentPhone(String deliveryAgentPhone) {
        this.deliveryAgentPhone = deliveryAgentPhone;
    }

    public String getDeliveryAgentRoute() {
        return deliveryAgentRoute;
    }

    public void setDeliveryAgentRoute(String deliveryAgentRoute) {
        this.deliveryAgentRoute = deliveryAgentRoute;
    }
}
