package com.meroka.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.meroka.model.Products;
import com.meroka.repository.ProductsRepository;
//defining the business logic
@Service
public class ProductsService
{
    @Autowired
    ProductsRepository productsRepository;
    //getting all product record by using the method findaAll() of CrudRepository
    public List<Products> getAllProducts()
    {
        List<Products> products = new ArrayList<Products>();
        productsRepository.findAll().forEach(products1 -> products.add(products1));
        return products;
    }
    //getting a specific record by using the method findById() of CrudRepository
    public Products getProductsById(int id)
    {
        return productsRepository.findById(id).get();
    }
    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Products products)
    {
        productsRepository.save(products);
    }
    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id)
    {
        productsRepository.deleteById(id);
    }
    //updating a record
    public void update(Products products, int itemId)
    {
        productsRepository.save(products);
    }
}
