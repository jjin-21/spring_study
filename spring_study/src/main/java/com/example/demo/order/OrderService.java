package com.example.demo.order;

public interface OrderService {
    // Order는 우리가 선언하는 리턴 타입
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
