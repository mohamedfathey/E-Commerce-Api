package com.e_commerceProject.ecommerce.repository;

import com.e_commerceProject.ecommerce.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface productRepo extends CrudRepository<Product,Long> {
    Product deleteById(long id) ;
}
