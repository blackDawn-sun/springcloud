package com.example.feign.controller;

import com.example.feign.instance.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductOne  {
    @Autowired
    @Qualifier("feign")
    public TestFeign testFeign;

   @RequestMapping(value = "mm",method = RequestMethod.GET)
    public String mm(@Validated String s){
       String str=null;
       if ("cc".equals(s)){
            str = testFeign.cc();
       }else if ("dd".equals(s)){
            str = testFeign.dd();
       }else if ("pp".equalsIgnoreCase(s)){
            str = testFeign.pp();
       }
       System.out.println(str);
       return str;

   }

}
