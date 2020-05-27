package com.jandacoding.springbootecommerce.dao;


import com.jandacoding.springbootecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
                                                    //Entity Product and Primary key
public interface ProductRepository extends JpaRepository<Product, Long> {

}
