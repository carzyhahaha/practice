package com.sy.practice.feign.controller;


import com.sy.practice.feign.service.ServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {


    @Autowired
    ServiceHi serviceHi;

    @RequestMapping("/hello")
    public String hi(@RequestParam String word) {
        return serviceHi.sayHiFromClientA(word);
    }
}
