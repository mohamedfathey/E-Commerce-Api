package com.e_commerceProject.ecommerce.Controller;

import com.e_commerceProject.ecommerce.entity.Product;
import com.e_commerceProject.ecommerce.repository.productRepo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class productController {

    private productRepo productRepo ;

    public productController(com.e_commerceProject.ecommerce.repository.productRepo productRepo) {
        super();
        this.productRepo = productRepo;
    }

    @GetMapping("/count")
    public long count (){
        return productRepo.count();
    }
    ////////// Find Product By Id ////////////
    @GetMapping("/getProductBy/{id}")
    public Product findProductById (@PathVariable long id ){
        return productRepo.findById(id).get();
    }

    //////// Find All Product  //////////////
    @GetMapping("/allProduct")
    public Iterable<Product> findAllProduct (){
        return productRepo.findAll();
    }

    /////// Add New Product /////////////
    @PostMapping("")
    public Product addNewProduct (@RequestBody Product product){
        return productRepo.save(product);
    }

    //////// Delete By Id //////////
    @DeleteMapping("deleteBy/{id}")
    public Product deleteById (@PathVariable long id){
        return productRepo.deleteById(id);
    }

    ///// UP Data By Id //////////
    @PutMapping("")
    public Product updateById(@RequestBody Product product){
        return productRepo.save(product);
    }

}
