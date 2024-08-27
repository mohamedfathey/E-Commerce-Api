package com.e_commerceProject.ecommerce.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

@Table("product")
@Component
public class Product {
    @Id
    private  long id ;
    private String name ;

    @Column("urlimage")
    private String imageURL ;

    private String description ;

    public Product() {
    }

    public Product(long id, String name, String imageURL, String description) {
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
