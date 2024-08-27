package com.e_commerceProject.ecommerce.repository;

import com.e_commerceProject.ecommerce.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface userRepo extends CrudRepository<User , Long > {
    User deleteById(long id);
}
