package com.cservice.Entity;

import com.cservice.Entity.Commons.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.*;


/**
 * Created by Oleg on 02.09.2016.
 */
@Entity
public class Contractor extends Account {

    @ManyToMany
    @JsonProperty("typeService")
    private Collection<TypeService> typeService;
    @JsonProperty("fax")
    private String fax;

    @ElementCollection
    @JsonProperty("workingDays")
    @Column(name = "workingHours", nullable = false)
    @MapKeyColumn(name = "dayOfWeek")
    private Map<Integer, WorkingHours> workingDays;

    @ManyToMany
    @JsonProperty("typeVehicle")
    private Collection<TypeVehicle> typeVehicle;

    @ManyToMany
    @JsonProperty("rangeWorks")
    private Collection<RangeWorks> rangeWorks;
    @JsonProperty("url")
    private String url;

    Contractor() {
        super(Role.CONTRACTOR);
    }

    public Contractor(String name, String email, String password, Collection<String> phone, Address address, String avatar, Collection<TypeService> typeService, String fax, Map<Integer, WorkingHours> workingDays, Collection<TypeVehicle> typeVehicle, Collection<RangeWorks> rangeWorks, String url) {
        super(Role.CONTRACTOR, name, email, password, phone, address, avatar);
        this.typeService = typeService;
        this.fax = fax;
        this.workingDays = workingDays;
        this.typeVehicle = typeVehicle;
        this.rangeWorks = rangeWorks;
        this.url = url;
    }

    /* typeService */
    public void setTypeService(Collection<TypeService> typeService) {
        this.typeService.clear();
        this.typeService.addAll(typeService);
    }

    public Collection<TypeService> getTypeService() {
        return typeService;
    }

//    public void addTypeServise(String... typeServise) {
//        if (typeServise.length > 0)
//            this.typeService.addAll(Arrays.asList(typeServise));
//    }

    public boolean removeTypeServise(String... typeServise) {
        return typeServise.length > 0 && this.typeService.removeAll(Arrays.asList(typeServise));
    }

    /* fax */
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    /* workingDays */
    public void setWorkingDays(Map<Integer, WorkingHours> workingDays) {
        this.workingDays.clear();
        this.workingDays.putAll(workingDays);
    }

    public Map<Integer, WorkingHours> getWorkingDays() {
        return workingDays;
    }

    public void addWorkingDays(int dayOfWeek, WorkingHours workingDays) {
        this.workingDays.put(dayOfWeek, workingDays);
    }

    public boolean removeWorkingDays(int dayOfWeek) {
        return this.workingDays.remove(dayOfWeek) != null;
    }

    /* typeVehicle */
    public void setTypeVehicle(Collection<TypeVehicle> typeVehicle) {
        this.typeVehicle.clear();
        this.typeVehicle.addAll(typeVehicle);
    }

    public Collection<TypeVehicle> getTypeVehicle() {
        return typeVehicle;
    }

//    public void addTypeVechile(String... typeVechile) {
//        if (typeVechile.length > 0)
//            this.typeVehicle.addAll(Arrays.asList(typeVechile));
//    }

    public boolean removeTypeVechile(String... typeVechile) {
        return typeVechile.length > 0 && this.typeVehicle.removeAll(Arrays.asList(typeVechile));
    }

    /* rangeWorks */
    public void setRangeWorks(Collection<RangeWorks> rangeWorks) {
        this.rangeWorks.clear();
        this.rangeWorks.addAll(rangeWorks);
    }

    public Collection<RangeWorks> getRangeWorks() {
        return rangeWorks;
    }

//    public void addRangeWorks(String... rangeWorks) {
//        if (rangeWorks.length > 0)
//            this.rangeWorks.addAll(Arrays.asList(rangeWorks));
//    }

    public boolean removeRangeWorks(String... rangeWorks) {
        return rangeWorks.length > 0 && this.rangeWorks.removeAll(Arrays.asList(rangeWorks));
    }

    /* url */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "typeService=" + typeService +
                ", fax='" + fax + '\'' +
                ", workingDays=" + workingDays +
                ", typeVehicle=" + typeVehicle +
                ", rangeWorks=" + rangeWorks +
                ", url='" + url + '\'' +
                "} " + super.toString();
    }
}