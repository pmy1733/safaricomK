package com.meroka.repository;

import org.springframework.data.repository.CrudRepository;
import com.meroka.model.Products;
//repository that extends CrudRepository
public interface ProductsRepository extends CrudRepository<Products, Integer>
{
}
