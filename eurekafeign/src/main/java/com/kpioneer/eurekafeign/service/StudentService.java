package com.kpioneer.eurekafeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author xionghu
 * @date 2020/4/28 18:45
 * @desc
 */
@FeignClient(name = "RIBBON-SERVICE")
public interface StudentService {

    /**
     * 获取所有学生列表
     * @return
     */
    @GetMapping(value = "/get")
    String getAllStudent();


}