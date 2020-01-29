//CRUD SERVICES - required in implementing CRUD - includes: setObject, getObject, deleteObject, updateObject
package com.service.services;

import com.service.model.Inventory;
import com.service.repository.InventoryRepository;
import com.service.model.Order;
import com.service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudService {
    @Autowired
    InventoryRepository inventoryRepository;
    @Autowired
    OrderRepository orderRepository;

    // Function to Store the Object of Inventory in Database
    public Inventory setInventory(Inventory inventory) {
        inventoryRepository.save(inventory);
        return inventory;
    }

    // Function to get all Inventories from Database
    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    // Function to get the specific Inventory by ID from Database
    public Inventory getInventory(Long id) {
        return inventoryRepository.findInventoryById(id);
    }

    // Function to delete the Object of specific Inventory by ID from Database
    public int deleteInventory(Long id) {
        inventoryRepository.deleteById(id);
        //success
        return 200;
    }

    // Function to Store the Object of Order in Database
    public Order setOrder(Order order) {
        orderRepository.save(order);
        return order;
    }

    // Function to get all Orders from Database
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Function to get the specific Order by ID from Database
    public Order getOrder(Long id) {
        return orderRepository.findOrderById(id);
    }

    // Function to delete the Object of specific Order by ID from Database
    public int deleteOrder(Long id) {
        orderRepository.deleteById(id);
        //success
        return 200;
    }
}
