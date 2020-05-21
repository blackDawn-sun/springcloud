package com.example.feign.controller;

import com.example.feign.instance.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductOne  {
    @Autowired
    @Qualifier("feign")
    public TestFeign testFeign;

   @RequestMapping("mm")
    public String mm(){
       return testFeign.dd();
   }

}
