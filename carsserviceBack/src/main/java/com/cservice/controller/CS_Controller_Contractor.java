package com.cservice.controller;


import com.cservice.Entity.Contractor;
import com.cservice.repository.ContractorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "contractor", produces = MediaType.APPLICATION_JSON_VALUE)
public class CS_Controller_Contractor {

    @Autowired
    private ContractorRepository cr;

    //returns list of available contractors
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{email}", method = RequestMethod.GET)
    public Contractor getAll(@PathVariable String email) {
        return cr.getConractorByEmail(email);
    }

    //returns list of available contractors
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String add() {

        return "pong";
    }


}
