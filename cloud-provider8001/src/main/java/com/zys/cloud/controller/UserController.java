package com.zys.cloud.controller;

import com.zys.cloud.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/user/get")
    public String get() {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "我是服务提供者，端口：" + port;
    }

    @GetMapping("/user/getParam")
    public String getParam(@RequestParam("name") String name) {
        return "我是服务提供者，参数：" + name + "，端口：" + port;
    }

    @PostMapping("/user/postParam")
    public String postParam(@RequestParam("username") String username) {
        return "我是服务提供者，参数：" + username + "，端口：" + port;
    }

    @PostMapping("/user/add")
    public String addUser(@RequestBody User user) {
        return "我是服务提供者，参数：" + user.toString() + "，端口：" + port;
    }


}
