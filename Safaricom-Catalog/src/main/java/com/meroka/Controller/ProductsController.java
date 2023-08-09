package com.meroka.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.meroka.model.Products;
import com.meroka.service.ProductsService;
//mark class as Controller  
@RestController
@RequestMapping("/api/v1")
public class ProductsController
{
    //autowire the ProductsService class  
    @Autowired
    ProductsService ProductsService;
    //creating a get mapping that retrieves all the Products detail from the database   
    @GetMapping("/product")
    public List<Products> getAllProducts()
    {
        return ProductsService.getAllProducts();
    }
    //creating a get mapping that retrieves the detail of a specific product
    @GetMapping("/product/{productid}")
    public Products getProducts(@PathVariable("productid") int productid)
    {
        return ProductsService.getProductsById(productid);
    }
    //creating a delete mapping that deletes a specified product
    @DeleteMapping("/product/{productid}")
    public void product(@PathVariable("productid") int productid)
    {
        ProductsService.delete(productid);
    }
    //creating post mapping that post the product detail in the database
    @PostMapping("/products")
    public int saveProduct(@RequestBody Products products)
    {
        ProductsService.saveOrUpdate(products);
        return products.getProductid();
    }
    //creating put mapping that updates the product detail
    @PutMapping("/Products")
    public Products update(@RequestBody Products products)
    {
        ProductsService.saveOrUpdate(products);
        return products;
    }
}  


