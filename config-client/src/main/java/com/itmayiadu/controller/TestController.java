package com.itmayiadu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${userName}")
    String userName;

    @RequestMapping(value = "/getUserName")
    public String getUserName () {
        return userName;
    }
}
