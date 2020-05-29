package com.example.feign.controller;

import com.example.feign.service.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Port {
//    @Value("$(server.port)")
//    private String port;
//    @Value("$(spring.application)")
//    private String host;
//    @Autowired
//    private ServerConfig serverConfig;
//
//    @RequestMapping(value = "host",method = RequestMethod.GET)
//    @ResponseBody
//    public String host(HttpRequest httpRequest){
//        System.out.println("url"+httpRequest.getURI());
//        System.out.println("method"+httpRequest.getMethod());
//        System.out.println("ss");
//        return serverConfig.getUrl()+":"+port;
//
//    }

}
