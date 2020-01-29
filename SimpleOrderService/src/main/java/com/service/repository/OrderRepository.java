//EMPLOYEE REPOSITORY - provides methods for CRUD operations
package com.service.repository;

import com.service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    public Order findOrderById(Long id);
    public void deleteById(Long id);
    public List<Order> findAll();
}
