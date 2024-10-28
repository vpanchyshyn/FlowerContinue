package com.example.demo;

import java.util.List;
import com.example.demo.delivery.Delivery;
import com.example.demo.payment.Payment;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Order {

    private List<Item> items;
    private Delivery delivery;
    private Payment payment;

    public void setItems(List<Item> newItems) {
        items = newItems;
    }

    public Order(List<Item> items, Delivery delivery) {
        this.items = items;
        this.delivery = delivery;
    }


}
