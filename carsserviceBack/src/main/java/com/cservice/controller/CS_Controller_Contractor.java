package com.cservice.controller;


import com.cservice.Entity.Commons.Address;
import com.cservice.Entity.Contractor;
import com.cservice.repository.ContractorRepository;
import com.cservice.service.impl.ContractorServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@EnableAutoConfiguration
@ComponentScan
@RequestMapping(value = "contractor", produces = MediaType.APPLICATION_JSON_VALUE)
public class CS_Controller_Contractor {

    private ContractorServiceImplementation crepo;

    //returns list of available contractors
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.POST)
    public void addContractor(@RequestBody Contractor contractor) {
        System.out.println(contractor);

        crepo.addContractor(contractor);
    }


    //returns list of available contractors
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "{email}", method = RequestMethod.GET)
    public Contractor getByEmail(@PathVariable("email") String email) {
        return crepo.getContractorByEmail(email);
    }

    //returns list of available contractors
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "{type}/{value}", method = RequestMethod.GET)
    public String add(@PathVariable String type, @PathVariable String value) {

        System.out.println("type=" + type + " value=" + value);

        return "pong";
    }




}
