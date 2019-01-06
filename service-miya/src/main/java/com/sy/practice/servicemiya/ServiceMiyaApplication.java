package com.sy.practice.servicemiya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ServiceMiyaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceMiyaApplication.class, args);
    }


    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;


    @RequestMapping("miya")
    public String miya() {
        return restTemplate.getForObject("http://localhost:8988/info", String.class);
    }

    @RequestMapping("info")
    public String info() {
        return "this is service-miya";
    }

}

