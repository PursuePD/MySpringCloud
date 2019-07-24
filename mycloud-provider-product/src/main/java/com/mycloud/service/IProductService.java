package com.mycloud.service;
import com.mycloud.entity.Product;

import java.util.List;
public interface IProductService {
    Product get(long id);
    boolean add(Product product);
    List<Product> list();
}