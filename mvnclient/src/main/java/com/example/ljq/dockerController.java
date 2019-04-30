package com.example.ljq;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dockerController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/hello")
    String sayhello(){
        return "hello,it is docker："+port;
    }
}
