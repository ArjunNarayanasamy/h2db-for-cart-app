package com.arjun.h2.h2db.dao;

import com.arjun.h2.h2db.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, String> {
}
