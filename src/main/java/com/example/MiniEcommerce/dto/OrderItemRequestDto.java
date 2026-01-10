package com.example.MiniEcommerce.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class OrderItemRequestDto {

    @NotNull(message = "productId is required")
    @Min(1)
    private Long productId;

    @NotNull(message = "Quantity is required")
    @Min(1)
    private Integer quantity;

    public OrderItemRequestDto() {
    }

    public @NotNull(message = "productId is required") @Min(1) Long getProductId() {
        return productId;
    }

    public void setProductId(@NotNull(message = "productId is required") @Min(1) Long productId) {
        this.productId = productId;
    }

    public @NotNull(message = "Quantity is required") @Min(1) Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(@NotNull(message = "Quantity is required") @Min(1) Integer quantity) {
        this.quantity = quantity;
    }


}
