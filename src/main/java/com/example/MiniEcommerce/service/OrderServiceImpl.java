package com.example.MiniEcommerce.service;

import com.example.MiniEcommerce.dto.OrderItemRequestDto;
import com.example.MiniEcommerce.dto.OrderItemResponseDto;
import com.example.MiniEcommerce.dto.PlaceOrderRequestDto;
import com.example.MiniEcommerce.dto.PlaceOrderResponseDto;
import com.example.MiniEcommerce.entity.Order;
import com.example.MiniEcommerce.entity.OrderItem;
import com.example.MiniEcommerce.entity.Product;
import com.example.MiniEcommerce.entity.User;
import com.example.MiniEcommerce.enums.Status;
import com.example.MiniEcommerce.repository.OrderRepository;
import com.example.MiniEcommerce.repository.ProductRepository;
import com.example.MiniEcommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public PlaceOrderResponseDto placeOrder(PlaceOrderRequestDto placeOrderRequestDto) {
        User user = userRepository.findById(placeOrderRequestDto.getUserId()).orElseThrow(()-> new RuntimeException("User not found!"));
        Order order = new Order();
        order.setUser(user);
        order.setStatus(Status.CREATED);

        List<OrderItemResponseDto> orders = new ArrayList<>();
        int totalAmount = 0;
        for(OrderItemRequestDto items: placeOrderRequestDto.getOrderItems()){
            Product product = productRepository.findById(items.getProductId()).orElseThrow(()->new RuntimeException("Product not found"));

            String productName = product.getProductName();
            Integer price = product.getPrice();
            Integer quantity = items.getQuantity();
            int subTotal = price * quantity;

            OrderItem orderItem = new OrderItem();
            orderItem.setProduct(product);
            orderItem.setPriceAtPurchase(price);
            orderItem.setQuantity(quantity);

            order.addOrderItem(orderItem);

            totalAmount += subTotal;
            OrderItemResponseDto orderItemResponseDto = new OrderItemResponseDto();
            orderItemResponseDto.setProductId(product.getId());
            orderItemResponseDto.setProductName(productName);
            orderItemResponseDto.setQuantity(quantity);
            orderItemResponseDto.setPrice(price);
            orderItemResponseDto.setSubTotal(subTotal);

            orders.add(orderItemResponseDto);

        }
        Order savedOrder = orderRepository.save(order);
        PlaceOrderResponseDto placeOrderResponseDto = new PlaceOrderResponseDto();
        placeOrderResponseDto.setOrderId(savedOrder.getId());
        placeOrderResponseDto.setUserId(user.getId());
        placeOrderResponseDto.setStatus(savedOrder.getStatus());
        placeOrderResponseDto.setOrderDate(savedOrder.getOrderDate());
        placeOrderResponseDto.setTotalAmount(totalAmount);
        placeOrderResponseDto.setItems(orders);

        return placeOrderResponseDto;
    }
}
