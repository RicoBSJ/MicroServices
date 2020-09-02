package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.Product;

import java.util.List;

public interface ProductDao {

    public List<Product> finAll();

    public Product findById();

    public Product save(Product product);
}
