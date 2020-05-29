package com.example.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
public class Consoume {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "z",method = RequestMethod.GET)
    public String z(){
       String port= restTemplate.getForObject("http://eureka-client-1/pp",String.class);
        System.out.println("=======================");
        System.out.println(port);
        return  port;
//        return "sd";
    }
}
