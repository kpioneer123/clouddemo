package com.kpioneer.eurekafeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author xionghu
 * @date 2020/4/28 18:45
 * @desc
 */
@FeignClient(name = "ms-provider-order")
public interface StudentService {

    /**
     * 获取所有学生列表
     * @return
     */
    @GetMapping(value = "/getStudent")
    String getAllStudent();


    //地址为服务提供者对外暴露的地址
    @RequestMapping(value = "/get" , method = RequestMethod.GET)
    String getMessage(@RequestParam("name") String name);





}