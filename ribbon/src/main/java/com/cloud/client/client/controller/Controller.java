package com.cloud.client.client.controller;

import com.cloud.client.client.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    Service service;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return service.hiService(name);
    }
}
