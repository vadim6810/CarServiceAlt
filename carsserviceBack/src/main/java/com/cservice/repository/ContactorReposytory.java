package com.cservice.repository;

import com.cservice.Entity.Commons.Address;
import com.cservice.Entity.Commons.WorkingHours;
import com.cservice.Entity.Contractor;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by Oleg on 02.09.2016.
 */
public interface ContactorReposytory {
    Contractor getConractor(String email);
    List<Contractor> getConractorByTypeVehicle(String typeVehicle);
    List<Contractor> getConractorByRangeWorks(String rangeWorks);
    List<Contractor> getConractorByCarManufacture(String typeVehicle, String carManufacture);
    List<Contractor> getConractorByArea(String area);
    List<Contractor> getConractorByCity(String city);
    Contractor addContatctor(String name, String email, String password, Collection<String>phone, Address address, String avatar,
                             Collection<String> typeService, String fax, Map<Integer, WorkingHours> workingDays, Collection<String> typeVechile,
                             Collection<String> rangeWorks, String url);
    boolean removeContactor(Contractor contractor);
    boolean removeContactor(String email);
    Collection<String> getTypeServise();
    void addTypeServise(String... typeServise);
    boolean removeTypeServise(String... typeServise);
    String getFax();
    void setFax(String fax);
    Map<Integer, WorkingHours> getWorkingDays();
    void addWorkingDays(int dayOfWeek, WorkingHours workingDays);
    boolean removeWorkingDays(int dayOfWeek);
    Collection<String> getTypeVechile();
    void addTypeVechile(String... typeVechile);
    boolean removeTypeVechile(String... typeVechile);
    Collection<String> getRangeWorks();
    void addRangeWorks(String... rangeWorks);
    boolean removeRangeWorks(String... rangeWorks);
    String getUrl();
    void setUrl(String url);
}
