package com.mycloud.mapper;

import com.mycloud.entity.Product;

import java.util.List;

/**
 * @Author:cuijialei
 * @Date: 2019/7/24
 * @Describe
 */
public interface ProductMapper {
    boolean create(Product product);
    public Product findById(Long id);
    public List<Product> findAll();
}
