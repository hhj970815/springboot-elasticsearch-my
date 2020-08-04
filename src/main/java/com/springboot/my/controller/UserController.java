package com.springboot.my.controller;

import com.springboot.my.service.EsService;
import com.springboot.my.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private EsService esService;

    @RequestMapping("/get/{id}")
    public String findById(@PathVariable Integer id) {
        return userService.findById(id).toString();
    }

    @RequestMapping("/tag/{province}")
    public String findByProvince(@PathVariable String province) {
        return esService.findByProvince(province).toString();
    }

    @RequestMapping("/all")
    public String findAll() {
        return esService.findAll().toString();
    }

}
