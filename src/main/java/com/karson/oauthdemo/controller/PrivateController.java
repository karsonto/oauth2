package com.karson.oauthdemo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivateController {

   
    @RequestMapping("/private")   
    public String index(){
        return "Hello private!";
    }
    
    @RequestMapping("/public")
    public String as(){
        return "Hello public!";
    }
}
 