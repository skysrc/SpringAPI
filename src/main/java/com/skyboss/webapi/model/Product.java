/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyboss.webapi.model;

/**
 *
 * @author sky
 */
public class Product {
    private String id;
    private String name;
    private String description;
    
    public Product() {
    }
    
    public Product(String id, String name, String desc) {
        super();
        this.id = id;
        this.name = name;
        this.description = desc;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
     public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
     public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String desc) {
        this.description = desc;
    }
}
