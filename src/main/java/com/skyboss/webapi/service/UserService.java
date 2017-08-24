/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyboss.webapi.service;

import java.util.List;
import com.skyboss.webapi.model.SBUser;

/**
 *
 * @author sky
 */
public interface UserService {
    List<SBUser> userList();
    SBUser findOne(Long id);
    SBUser addUser(SBUser user);
    String deleteUser(Long id);
}
