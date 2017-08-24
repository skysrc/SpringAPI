/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyboss.webapi.controller;

import com.skyboss.webapi.model.SBUser;
import com.skyboss.webapi.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sky
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/list/{id}")
    public SBUser findOne(@PathVariable Long id) {
        return this.userService.findOne(id);
    }

    @RequestMapping("/list")
    public List<SBUser> GetAll() {
        return userService.userList();
    }

    @RequestMapping("/add")
    public SBUser addUser(@RequestBody SBUser user) {
        return userService.addUser(user);
    }

    @RequestMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }
}
