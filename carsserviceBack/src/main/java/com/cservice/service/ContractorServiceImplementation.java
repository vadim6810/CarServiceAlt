package com.cservice.service;

import com.cservice.Entity.Commons.WorkingHours;
import com.cservice.Entity.Contractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 10/09/2016.
 */

@Service
public class ContractorServiceImplementation implements ContractorService {

    @Autowired
    private ContractorRepository contractorRepository;


    public ContractorServiceImplementation(){

    }


    public ContractorRepository getContractorRepository() {
        return contractorRepository;
    }

    public void setContractorRepository(ContractorRepository contractorRepository) {
        this.contractorRepository = contractorRepository;
    }

    @Override
    public Contractor addContractor(Contractor c) {

        System.out.println("save=" + c);
        try {
            contractorRepository.saveAndFlush(c);
        } catch (Exception e) {

            System.out.println("exception");
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void removeContractor(Contractor contractor) {

    }

    @Override
    public boolean removeContractorByEmail(String email) {
        return false;
    }

    @Override
    public boolean removeContractorByName(String name) {
        return false;
    }

    @Override
    public Collection<String> getTypeService() {
        return null;
    }

    @Override
    public void addTypeService(String... typeService) {

    }

    @Override
    public boolean removeTypeService(String... typeService) {
        return false;
    }

    @Override
    public String getFax() {
        return null;
    }

    @Override
    public void setFax(String fax) {

    }

    @Override
    public Map<Integer, WorkingHours> getWorkingDays() {
        return null;
    }

    @Override
    public void addWorkingDays(int dayOfWeek, WorkingHours workingDays) {

    }

    @Override
    public boolean removeWorkingDays(int dayOfWeek) {
        return false;
    }

    @Override
    public Collection<String> getTypeVehicle() {
        return null;
    }

    @Override
    public void addTypeVehicle(String... typeVehicle) {

    }

    @Override
    public boolean removeTypeVehicle(String... typeVehicle) {
        return false;
    }

    @Override
    public Collection<String> getRangeWorks() {
        return null;
    }

    @Override
    public void addRangeWorks(String... rangeWorks) {

    }

    @Override
    public boolean removeRangeWorks(String... rangeWorks) {
        return false;
    }

    @Override
    public String getUrl() {
        return null;
    }

    @Override
    public void setUrl(String url) {

    }

    public Contractor getContractorByEmail(String email) {
        return contractorRepository.findByEmail(email);
    }

    @Override
    public Contractor getContractorByName(String name) {
        return null;
    }

    @Override
    public List<Contractor> getContractorByTypeVehicle(String typeVehicle) {
        return null;
    }

    @Override
    public List<Contractor> getContractorByRangeWorks(String rangeWorks) {
        return null;
    }

    @Override
    public List<Contractor> getContractorByCarManufacture(String typeVehicle, String carManufacture) {
        return null;
    }

    @Override
    public List<Contractor> getContractorByArea(String area) {
        return null;
    }

    @Override
    public List<Contractor> getContractorByCity(String city) {
        return null;
    }

}
