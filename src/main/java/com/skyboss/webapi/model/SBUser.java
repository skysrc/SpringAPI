/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyboss.webapi.model;

import javax.persistence.Entity;
import org.springframework.data.jpa.domain.AbstractPersistable;


/**
 *
 * @author sky
 */

@Entity
public class SBUser extends AbstractPersistable<Long>  {
    private static final long serialVersionUID = -7302800336276816169L;
    private String sbuserId;
    private String userName;
    private String password;

    public String getSBUserId() {
        return sbuserId;
    }

    public void setSBUserId(String userId) {
        this.sbuserId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
