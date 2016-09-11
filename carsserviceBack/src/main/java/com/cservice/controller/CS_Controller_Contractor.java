package com.cservice.controller;


import com.cservice.Entity.Contractor;
import com.cservice.service.ContractorService;

import com.cservice.service.ContractorServiceImplementation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Transactional
@Controller
@ComponentScan(basePackages = "com.cservice")
@RequestMapping(value = "contractor", produces = MediaType.APPLICATION_JSON_VALUE)
public class CS_Controller_Contractor {
    private static final Logger log = LoggerFactory.getLogger(CS_Controller_Contractor.class);

    @Autowired
    private ContractorService contractorService;


    //returns list of available contractors
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.POST)
    public void addContractor(@RequestBody Contractor contractor) {

        log.info(contractor.toString());
        contractorService.addContractor(contractor);

        System.out.println(contractor);

    }


    //returns list of available contractors
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping( method = RequestMethod.GET)
    public Contractor getByEmail(@RequestParam("email") String email) {
        System.out.println(email);

        return contractorService.getContractorByEmail(email);
    }

//    //returns list of available contractors
//    @ResponseStatus(HttpStatus.OK)
//    @RequestMapping(value = "{type}/{value}", method = RequestMethod.GET)
//    public String add(@PathVariable String type, @PathVariable String value) {
//
//        System.out.println("type=" + type + " value=" + value);
//
//        return "pong";
//    }




}
