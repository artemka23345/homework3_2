package com.skypro.homework3_2.service;

import java.util.List;

public interface CartService {

    void add(List<Integer> item);
    List<Integer> get();
}
