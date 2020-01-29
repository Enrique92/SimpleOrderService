package com.service.Tests;

import com.service.model.Order;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OrderTest {
    Order ord = new Order();

    @Test
    public void testQuantity() {
        assertEquals("Email can't be nill", " ", ord.getEmail());
    }

    @Test
    public void testNoQuantity() {
        assertEquals("The order need a date", " ", ord.getDate());
    }
}