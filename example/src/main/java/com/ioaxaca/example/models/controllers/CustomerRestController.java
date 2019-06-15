/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ioaxaca.example.models.controllers;

import com.ioaxaca.example.models.entities.Customer;
import java.time.Instant;
import java.util.Date;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Israel
 */
@CrossOrigin({"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CustomerRestController {
    
    @GetMapping("/customer-test")
    public Customer getCustomer(){
        Customer c=new Customer();
        c.setCreateAt(Date.from(Instant.now()));
        c.setEmail("ioaxaca93@gmail.com");
        c.setId(1l);
        c.setLastName("Oaxaca");
        c.setName("Israel");
        return c;
    }
}
