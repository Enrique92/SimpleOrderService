//CRUD CONTROLLER - a controller for the given entity
package com.service.controller;

import com.service.repository.OrderRepository;
import com.service.services.CrudService;
import com.service.model.Inventory;
import com.service.repository.InventoryRepository;
import com.service.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CrudController {
    @Autowired
    CrudService crudService;
    InventoryRepository repo;
    OrderRepository ord;

    // CREATE
    @RequestMapping(value={"/inventories"}, method = RequestMethod.POST)
    public @ResponseBody Inventory setInventory(@RequestBody Inventory inventory) {
        return crudService.setInventory(inventory);
    }

    // GET ALL INVENTORIES
    @RequestMapping(value={"/inventories"}, method = RequestMethod.GET)
    public @ResponseBody Iterable<Inventory> getAllInventory() {
        // This returns a JSON or XML with the inventory
        return crudService.getAllInventory();
    }

    // UPDATE
    @RequestMapping(value = {"/inventories/{id}"}, method = RequestMethod.PUT)
    public @ResponseBody Inventory updateInventory(@RequestBody Inventory inv, @PathVariable("id") Long id) {
        Inventory inventory = crudService.getInventory(id);
        if (inventory == null) {
            //if no such inventory exist with the specified ID
            return crudService.setInventory(inv);
        } else {
            //if such exist
            inventory.setName(inv.getName());
            return crudService.setInventory(inventory);
        }
    }

    // DELETE
    @RequestMapping(value = {"/inventories/{id}"}, method = RequestMethod.DELETE)
    public @ResponseBody int deleteInventory(@PathVariable("id") Long id) {
        return crudService.deleteInventory(id);
    }

    // SPECIFIC INVENTORY
    @RequestMapping(value = {"/inventories/{id}"}, method = RequestMethod.GET)
    public @ResponseBody Inventory getInventory(@PathVariable("id") Long id) {
        return crudService.getInventory(id);
    }

    // ORDERS

    // CREATE
    @RequestMapping(value = {"/orders"}, method = RequestMethod.POST)
    public @ResponseBody Order setOrder(@RequestBody Order order) {
        return crudService.setOrder(order);
    }

    // GET ALL ORDERS
    @RequestMapping(value={"/orders"}, method = RequestMethod.GET)
    public @ResponseBody Iterable<Order> getAllOrders() {
        // This returns a JSON or XML with the inventory
        return crudService.getAllOrders();
    }

    // UPDATE
    @RequestMapping(value = {"/orders/{id}"}, method = RequestMethod.PUT)
    public @ResponseBody Order updateOrder(@RequestBody Order ord, @PathVariable("id") Long id) {
        Order order = crudService.getOrder(id);
        if (order == null) {
            //if no such inventory exist with the specified ID
            return crudService.setOrder(ord);
        } else {
            //if such exist
            order.setEmail(ord.getEmail());
            return crudService.setOrder(order);
        }
    }

    // DELETE
    @RequestMapping(value = {"/orders/{id}"}, method = RequestMethod.DELETE)
    public @ResponseBody int deleteOrder(@PathVariable("id") Long id) {
        return crudService.deleteOrder(id);
    }

    // SPECIFIC ORDER
    @RequestMapping(value = {"/orders/{id}"}, method = RequestMethod.GET)
    public @ResponseBody Order getOrder(@PathVariable("id") Long id) {
        return crudService.getOrder(id);
    }
}
