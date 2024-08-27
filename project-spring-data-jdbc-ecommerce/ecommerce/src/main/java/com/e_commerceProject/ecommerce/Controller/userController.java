package com.e_commerceProject.ecommerce.Controller;

import com.e_commerceProject.ecommerce.entity.User;
import com.e_commerceProject.ecommerce.repository.userRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

public class userController {

   private userRepo userRepo ;

    public userController(com.e_commerceProject.ecommerce.repository.userRepo userRepo) {
        super();
        this.userRepo = userRepo;
    }
    ////////////////count ///////////////
    @GetMapping("/count")
    public long count ()
    {
        return  userRepo.count();
    }
    //////////// select All Data //////////////
    @GetMapping("/allData")
    public Iterable<User> allData (){
        return userRepo.findAll();
    }

    ///////////Select by ID //////////
    @GetMapping("/findThe/{id}")
    public User findById(@PathVariable long id){
        return userRepo.findById(id).get();
    }
    /////////// Add new user /////////
    @PostMapping("")
    public User addNewUser (@RequestBody User user){
        return userRepo.save(user);
    }
    ////// Update User //////////
    @PutMapping("")
    public User updateUser (@RequestBody User user){
        return  userRepo.save(user);
    }


    ///////// delete data /////////////////

    @DeleteMapping("Delete/{id}")
    public User deleteUser (@PathVariable long id){
        return userRepo.deleteById(id);
    }



}
