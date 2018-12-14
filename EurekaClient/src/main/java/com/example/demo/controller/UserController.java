package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("user")
public class UserController {
//    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

//    @Autowired
//    private IUserService userService;

//    @GetMapping("getUser")
//    public List<UserEntity> getUser() {
//        UserEntity user = new UserEntity();
//        return userService.getUser();
//    }

    @GetMapping("getUser")
    public String getUser() {

        return "client api";
    }

}

