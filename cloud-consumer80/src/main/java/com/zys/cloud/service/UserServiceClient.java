package com.zys.cloud.service;

import com.zys.cloud.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

//指定微服务名称
@FeignClient(value = "cloud-consul-provider")
public interface UserServiceClient {

    @GetMapping("/user/get")
    String get();

    @GetMapping("/user/getParam")
    String getParam(@RequestParam("name") String name);

    @PostMapping("/user/postParam")
    String postParam(@RequestParam("username") String username);

    @PostMapping("/user/add")
    String addUser(@RequestBody User user);
}
