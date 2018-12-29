package com.sy.practice.feign.service;

public class ServiceHiHystric implements ServiceHi {

    @Override
    public String sayHiFromClientA(String word) {
        return "feign error word = " + word;
    }
}
