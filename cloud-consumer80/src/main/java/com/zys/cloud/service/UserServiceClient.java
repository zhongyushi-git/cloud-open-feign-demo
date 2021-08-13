package com.zys.cloud.service;

import com.zys.cloud.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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

    //文件上传
    @PostMapping(value = "/user/fileUpload",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String fileUpload(@RequestPart("file")MultipartFile file);
}
