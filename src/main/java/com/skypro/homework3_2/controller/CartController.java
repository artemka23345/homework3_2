package com.skypro.homework3_2.controller;

import com.skypro.homework3_2.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("store/order/")
public class CartController {

    public final CartService cartService;

    public CartController(CartService CartService) {
        this.cartService = CartService;
    }

    @GetMapping("/add")
    public void addItem(@RequestParam List<Integer> items) {
        cartService.add(items);

    }

    @GetMapping("/get")
    public List<Integer> getItem() {
        return cartService.get();

    }
}
