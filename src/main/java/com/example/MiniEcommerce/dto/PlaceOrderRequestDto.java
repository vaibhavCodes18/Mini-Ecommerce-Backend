package com.example.MiniEcommerce.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class PlaceOrderRequestDto {
    @NotNull(message = "userId is required")
    @Min(1)
    private Long userId;

    @NotNull(message = "orderItem is required")
    private List<OrderItemRequestDto> orderItems;

    public PlaceOrderRequestDto() {
    }

    public @NotNull(message = "userId is required") @Min(1) Long getUserId() {
        return userId;
    }

    public void setUserId(@NotNull(message = "userId is required") @Min(1) Long userId) {
        this.userId = userId;
    }

    public @NotNull(message = "orderItem is required") List<OrderItemRequestDto> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(@NotNull(message = "orderItem is required") List<OrderItemRequestDto> orderItems) {
        this.orderItems = orderItems;
    }
}
