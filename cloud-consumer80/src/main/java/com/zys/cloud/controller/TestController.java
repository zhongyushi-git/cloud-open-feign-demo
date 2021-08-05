package com.zys.cloud.controller;

import com.zys.cloud.entity.User;
import com.zys.cloud.service.UserServiceClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer")
public class TestController {

    @Resource
    private UserServiceClient userServiceClient;

    @GetMapping("/get")
    public String get() {
        return userServiceClient.get();
    }

    @GetMapping("/param")
    public String getParam(String name) {
        return userServiceClient.getParam(name);
    }

    @PostMapping("/post")
    public String postParam(String username) {
        return userServiceClient.postParam(username);
    }

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        return userServiceClient.addUser(user);
    }
}