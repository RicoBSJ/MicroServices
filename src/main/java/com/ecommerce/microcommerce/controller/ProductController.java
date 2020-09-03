package com.ecommerce.microcommerce.controller;

import com.ecommerce.microcommerce.dao.ProductDao;
import com.ecommerce.microcommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;

    //Produits
    @GetMapping(value = "Produits")
    public List<Product> listeProduits(){
        return productDao.finAll();
    }

    //Produits/{id}
    @GetMapping(value = "Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id){

        Product product = new Product(id, new String("aspirateur"), 100);

        return product;
    }

    @PostMapping(value = "/Produits")
    public void ajouterProduit(@RequestBody Product product) {

        productDao.save(product);
    }
}
