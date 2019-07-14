package com.arjun.h2.h2db.dao;

import com.arjun.h2.h2db.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, String> {
}
