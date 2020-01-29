//EMPLOYEE REPOSITORY - provides methods for CRUD operations
package com.service.repository;

import com.service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    public Inventory findInventoryById(Long id);
    public void deleteById(Long id);
    public List<Inventory> findAll();
}
