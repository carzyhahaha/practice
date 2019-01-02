package com.sy.practice.feign.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ServiceHiHystric implements ServiceHi {

    @Override
    public String sayHiFromClientA(String word) {
        return "feign error word = " + word;
    }
}
