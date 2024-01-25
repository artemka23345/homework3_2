package com.skypro.homework3_2;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import java.util.List;

@Component
@SessionScope
public class Cart {

    private List<Integer> items;

    public Cart(List<Integer> items) {
        this.items = items;
    }

    public List<Integer> getItems() {
        return items;
    }

    public void add(List<Integer> items) {
        items.addAll(items);
    }

}
