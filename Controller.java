package com.datorium.Datorium.API.Controller;

import com.datorium.Datorium.API.DTOs.User;
import com.datorium.Datorium.API.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;
    public UserController(){
        userService = new UserService();
    }
    //CRUD
    //AddUser
    //UpdateUser
    //GetUser
    //DeleteUser

    @PostMapping("/add") //localhost:8080/test -> localhost:8080/user/test
    public int add(@RequestBody User user){
        return userService.add(user);
    }

    @GetMapping("/all")
    public ArrayList<User> getAllUsers() {
        return userService.getAllUsers();
    }
}