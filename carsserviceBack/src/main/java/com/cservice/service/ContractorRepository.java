package com.cservice.service;

import com.cservice.Entity.Contractor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import java.util.List;


public interface ContractorRepository extends JpaRepository<Contractor, Long> {


    List<Contractor> findByCity( String city);

    Contractor findByEmail(String email);
}
