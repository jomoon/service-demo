package com.hjj.servicedemo.controller;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaController {
    @Autowired
    public EurekaClient eurekaClient;

    @GetMapping("infos")
    public Object serviceUrl() {
        return eurekaClient.getInstancesByVipAddress("hjj-house",false);
    }
}
