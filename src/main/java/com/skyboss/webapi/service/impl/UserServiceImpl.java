/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyboss.webapi.service.impl;

import com.skyboss.webapi.model.SBUser;
import com.skyboss.webapi.repository.UserRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import com.skyboss.webapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author sky
 */

@Service
public class UserServiceImpl implements UserService{
    
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository _userRepository) {
        this.userRepository = _userRepository;
    }
    
    @Override
    public List<SBUser> userList() {
        return userRepository.findAll();
    }
}
