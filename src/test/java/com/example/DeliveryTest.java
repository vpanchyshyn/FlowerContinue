package com.example;

import com.example.demo.delivery.DHLDeliveryStrategy;
import com.example.demo.delivery.Delivery;
import com.example.demo.delivery.PostDeliveryStrategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeliveryTest {

    @Test
    public void testDHLDelivery() {
        Delivery delivery = new DHLDeliveryStrategy();
        String result = delivery.getDeliveryNotification();
        assertEquals("Delivery with DHL", result, "DHL delivery should return the correct notification");
    }

    @Test
    public void testPostDelivery() {
        Delivery delivery = new PostDeliveryStrategy();
        String result = delivery.getDeliveryNotification();
        assertEquals("Delivery with simple Post", result, "Post delivery should return the correct notification");
    }
}
