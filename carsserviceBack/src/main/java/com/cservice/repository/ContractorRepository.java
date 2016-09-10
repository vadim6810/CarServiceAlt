package com.cservice.repository;

import com.cservice.Entity.Commons.Address;
import com.cservice.Entity.Commons.WorkingHours;
import com.cservice.Entity.Contractor;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.Repository;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by Oleg on 02.09.2016.
 */
public interface ContractorRepository extends Repository<Contractor, Long> {
    Contractor getContractorByEmail(String email);

    Contractor getContractorByName(String name);

    List<Contractor> getContractorByTypeVehicle(String typeVehicle);

    List<Contractor> getContractorByRangeWorks(String rangeWorks);

    List<Contractor> getContractorByCarManufacture(String typeVehicle, String carManufacture);

    List<Contractor> getContractorByArea(String area);

    List<Contractor> getContractorByCity(String city);

    Contractor addContractor(String name, String email, String password, Collection<String> phone, Address address, String avatar,
                             Collection<String> typeService, String fax, Map<Integer, WorkingHours> workingDays, Collection<String> typeVehicle,
                             Collection<String> rangeWorks, String url);

    boolean removeContractor(Contractor contractor);

    boolean removeContractorByEmail(String email);

    boolean removeContractorByName(String name);

    Collection<String> getTypeService();

    void addTypeService(String... typeService);

    boolean removeTypeService(String... typeService);

    String getFax();

    void setFax(String fax);

    Map<Integer, WorkingHours> getWorkingDays();

    void addWorkingDays(int dayOfWeek, WorkingHours workingDays);

    boolean removeWorkingDays(int dayOfWeek);

    Collection<String> getTypeVehicle();

    void addTypeVehicle(String... typeVehicle);

    boolean removeTypeVehicle(String... typeVehicle);

    Collection<String> getRangeWorks();

    void addRangeWorks(String... rangeWorks);

    boolean removeRangeWorks(String... rangeWorks);

    String getUrl();

    void setUrl(String url);
}
