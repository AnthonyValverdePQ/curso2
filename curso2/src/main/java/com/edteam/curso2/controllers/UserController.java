package com.edteam.curso2.controllers;

import com.edteam.curso2.models.User;
import com.edteam.curso2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
//trae todos
    @RequestMapping(value="/",method = RequestMethod.GET)
    List<User> getAll(){
        return   userService.getAll();
    }

    //trae por id
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    User get(@PathVariable long id){

      return userService.get(id);

    }

    //Registrar usuario
    @RequestMapping(value="/",method = RequestMethod.POST)
    User register(@RequestBody User user){
        return   userService.register(user);
    }

    //Registrar usuario
    @RequestMapping(value="/{id}",method = RequestMethod.PUT)
    User update(@RequestBody User user){
        return   userService.update(user);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    void delete(@PathVariable long id){
        userService.delete(id);

    }
}
