package com.zys.cloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//配置feign日志级别
//@Configuration
public class LogConfig {
//    @Bean
    Logger.Level feignLevel(){
        return Logger.Level.FULL;
    }
}