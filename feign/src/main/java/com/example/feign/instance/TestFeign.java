package com.example.feign.instance;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "eureka-client-1")
@Qualifier("feign")
public interface TestFeign {

    @ResponseBody
    @RequestMapping("cc")
    String cc();

    @ResponseBody
    @RequestMapping("dd")
    String dd();
}
