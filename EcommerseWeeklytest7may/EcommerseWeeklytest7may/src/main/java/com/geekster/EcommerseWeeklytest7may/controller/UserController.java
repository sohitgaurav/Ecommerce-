package com.geekster.EcommerseWeeklytest7may.controller;

import com.geekster.EcommerseWeeklytest7may.models.Address;
import com.geekster.EcommerseWeeklytest7may.models.User;
import com.geekster.EcommerseWeeklytest7may.repository.IUserRepo;
import com.geekster.EcommerseWeeklytest7may.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/")
    void saveUser(@RequestBody User myUser){
        List<Address> Addresses = myUser.getUserAddresses();
        for(Address add : Addresses ){
            add.setUser(myUser);
        }


        userService.save(myUser);
    }

    @GetMapping("/{id}")
    public User getUserByUserId(@PathVariable Long id){
            return userService.getUserById(id);
    }
}
