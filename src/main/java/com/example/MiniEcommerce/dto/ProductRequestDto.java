package com.example.MiniEcommerce.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProductRequestDto {
    @NotBlank(message = "Product name is required")
    private String productName;
    @NotNull(message = "Price is required")
    @Min(1)
    private Integer price;

    public ProductRequestDto() {
    }

    public @NotBlank(message = "Product name is required") String getProductName() {
        return productName;
    }

    public void setProductName(@NotBlank(message = "Product name is required") String productName) {
        this.productName = productName;
    }

    public @NotNull(message = "Price is required") @Min(1) Integer getPrice() {
        return price;
    }

    public void setPrice(@NotNull(message = "Price is required") @Min(1) Integer price) {
        this.price = price;
    }
}
