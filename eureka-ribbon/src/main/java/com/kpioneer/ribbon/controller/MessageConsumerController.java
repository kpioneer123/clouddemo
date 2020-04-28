package com.kpioneer.ribbon.controller;


import com.kpioneer.ribbon.config.HttpClientConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author xionghu
 * @date 2020/4/26 14:44
 * @desc
 */
@RestController
public class MessageConsumerController {

    @Value("${server.port}")
    String port;

    @Autowired
    private RestTemplate restTemplate;//这样就可以直接调用api使用了或者直接new对象也一样
    private static final Logger LOGGER = LoggerFactory.getLogger(HttpClientConfig.class);


    @GetMapping("/get")
    public String getMessage(@RequestParam("name") String name) {

        String requestUrl = "http://ms-provider-order/get?name=“ddsdd";
        String abc = restTemplate.getForObject(requestUrl, String.class);
        return restTemplate.getForObject(requestUrl, String.class);

    }

}
