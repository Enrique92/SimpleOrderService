package com.service.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue
    private int id;
    private String email;
    private String date;
    private String status;

    @OneToMany(targetEntity = Inventory.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "orders_inventory_fk", referencedColumnName = "id")
    private List<Inventory> inventoryList;

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }
}
