package com.cservice.service.impl;

import com.cservice.Entity.Commons.WorkingHours;
import com.cservice.Entity.Contractor;
import com.cservice.repository.ContractorRepository;
import com.cservice.service.ContractorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 10/09/2016.
 */

public class ContractorServiceImplementation  {

    private ContractorRepository cr;


    public void addContractor(Contractor c){

        System.out.println("save="+c);
        try {
            cr.saveAndFlush(c);
        } catch (Exception e) {

            System.out.println("exception");
            e.printStackTrace();
        }
    }

    public Contractor getContractorByEmail(String email){
        return cr.findByEmail(email);
    }

}
