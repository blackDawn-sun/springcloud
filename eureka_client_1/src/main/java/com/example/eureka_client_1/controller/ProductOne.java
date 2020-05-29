package com.example.eureka_client_1.controller;

import com.example.feign.instance.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductOne implements TestFeign{

    @Value("${server.port}")
    private String port;

    public String cc(){
        return this.getClass().getSimpleName();
    }


    public String dd(){
        return this.getClass().getCanonicalName();
    }
    @RequestMapping(value ="pp")
    @ResponseBody
    public String pp(){
        return port;
    }


}
