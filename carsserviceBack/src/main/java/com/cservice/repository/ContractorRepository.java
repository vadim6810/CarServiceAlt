package com.cservice.repository;

import com.cservice.Entity.Contractor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface ContractorRepository extends CrudRepository<Contractor, Long> {


    List<Contractor> findByCity( String city);

    Contractor findByEmail(String email);
}
