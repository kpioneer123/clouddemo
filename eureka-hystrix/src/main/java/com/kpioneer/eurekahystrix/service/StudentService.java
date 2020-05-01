package com.kpioneer.eurekahystrix.service;

import com.kpioneer.eurekahystrix.FallbackTest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xionghu
 * @date 2020/4/28 18:45
 * @desc
 */
@FeignClient(name = "ms-provider-order",fallback = FallbackTest.class)
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