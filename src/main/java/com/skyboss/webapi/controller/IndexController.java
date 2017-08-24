/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyboss.webapi.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sky
 */

@RestController
public class IndexController implements ErrorController {
    private static final String PATH ="/error";
    
    @Override
    public String getErrorPath() {
        return PATH;
    }
    
    @RequestMapping(PATH)
    public String Error() {
        return "No mapping available.";
    }
}
