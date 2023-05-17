package com.geekster.EcommerseWeeklytest7may.repository;

import com.geekster.EcommerseWeeklytest7may.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Order,Long> {
    Order findByOrderId(Long orderId);
}
