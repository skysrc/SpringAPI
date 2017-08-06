/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyboss.webapi.controller;

import com.skyboss.webapi.model.Product;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sky
 */
@RestController
public class ProductController {

    @RequestMapping("/products")
    public List<Product> getAllProducts() {
        return Arrays.asList(
                new Product("1", "FirstProduct", "the 1st product"),
                new Product("2", "2ndProduct", "the 2nd product"),
                new Product("3", "3rdProduct", "the 3rd product"));
    }
}
