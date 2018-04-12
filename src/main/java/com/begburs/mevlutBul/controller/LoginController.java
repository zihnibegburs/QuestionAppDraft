package com.begburs.mevlutBul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.begburs.mevlutBul.model.User;
import com.begburs.mevlutBul.service.UserService;



@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    @CrossOrigin
    public ResponseEntity<User> login(@RequestBody String userParam) {

        User user = new User();
        user.setEmail(userParam);
        user.setName("zihni");
        user.setSurname("begburs");
        user = userService.register(user);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

}
