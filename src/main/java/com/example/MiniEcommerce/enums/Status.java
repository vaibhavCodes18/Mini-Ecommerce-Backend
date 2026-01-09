package com.example.MiniEcommerce.enums;

public enum Status {
    CREATED,        // Order is created but not yet processed
    CONFIRMED,      // Order is confirmed
    PROCESSING,     // Order is being prepared
    SHIPPED,        // Order is shipped
    OUT_FOR_DELIVERY, // Order is out for delivery
    DELIVERED,      // Order delivered successfully
    CANCELLED,      // Order cancelled by user or system
    RETURN_REQUESTED, // Return requested by customer
    RETURNED,       // Order returned
    REFUNDED
}
