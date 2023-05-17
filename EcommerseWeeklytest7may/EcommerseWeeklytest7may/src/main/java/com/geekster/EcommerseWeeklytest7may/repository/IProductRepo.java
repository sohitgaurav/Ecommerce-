package com.geekster.EcommerseWeeklytest7may.repository;

import com.geekster.EcommerseWeeklytest7may.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends JpaRepository<Product,Integer> {
    Product findByProductId(Integer productId);


    List<Product> findByProductCategory(String category);
}
