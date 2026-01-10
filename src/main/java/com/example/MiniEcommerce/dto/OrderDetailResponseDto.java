package com.example.MiniEcommerce.dto;

import com.example.MiniEcommerce.enums.Status;

import java.time.LocalDate;
import java.util.List;

public class OrderDetailResponseDto {
    private Long userId;
    private Long orderId;
    private Status status;
    private LocalDate orderedDate;
    private Integer totalAmount;
    private List<ItemDetailResponseDto> items;

    public OrderDetailResponseDto() {}

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getOrderedDate() {
        return orderedDate;
    }

    public void setOrderedDate(LocalDate orderedDate) {
        this.orderedDate = orderedDate;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<ItemDetailResponseDto> getItems() {
        return items;
    }

    public void setItems(List<ItemDetailResponseDto> items) {
        this.items = items;
    }
}
