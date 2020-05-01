package com.kpioneer.eurekahystrix.controller;

import com.kpioneer.eurekahystrix.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xionghu
 * @date 2020/4/26 14:44
 * @desc
 */
@RestController
public class MessageConsumerController  {




    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/get" , method = RequestMethod.GET)
    public String hello(){
        return studentService.getMessage("XIONHG");
    }


}
