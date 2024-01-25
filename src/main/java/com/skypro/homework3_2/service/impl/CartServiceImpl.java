package com.skypro.homework3_2.service.impl;

import com.skypro.homework3_2.Cart;
import com.skypro.homework3_2.service.CartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    public void add(List<Integer> items) {
        cart.getItems().addAll(items);
    }

    public List<Integer> get() {
        return cart.getItems();
    }
}
