package com.cservice.repository;

import com.cservice.Entity.Contractor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContractorRepository extends JpaRepository<Contractor, Long> {

    List<Contractor> findByCity(String city);

    Contractor findByEmail(String email);
}
