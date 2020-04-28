package com.kpioneer.eurekaprovider.controller02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author xionghu
 * @date 2020/4/26 14:42
 * @desc
 */
@RestController
public class MessageController {

    @Value("${server.port}")
    String port;

    @GetMapping("/get")
    public String getMessage(@RequestParam("name") String name) {
        return "Hi " + name + " ,I am from port:" + port;
    }

}