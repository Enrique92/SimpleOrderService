package com.service.Tests;

import com.service.model.Inventory;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestInventory {
    Inventory inv = new Inventory();

    @Test
    public void testQuantity() {
        assertEquals("Not items available", 1, inv.getQuantity());
    }

    @Test
    public void testNoQuantity() {
        assertEquals("Not items introduce in the order", 0, inv.getQuantity());
    }
}
