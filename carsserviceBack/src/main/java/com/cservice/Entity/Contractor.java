package com.cservice.Entity;

import com.cservice.Entity.Commons.Account;
import com.cservice.Entity.Commons.Address;
import com.cservice.Entity.Commons.Role;
import com.cservice.Entity.Commons.WorkingHours;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.*;

import static com.cservice.Entity.Commons.Role.CONTRACTOR;


/**
 * Created by Oleg on 02.09.2016.
 */
@Entity
public class Contractor extends Account {

    @ManyToMany
    private Collection<String> typeServise = new HashSet<>();
    private String fax;

    @ElementCollection
    @Column(name = "dayOfWeek", nullable = false)
    private Map<Integer, WorkingHours> workingDays = new HashMap<>();

    @ManyToMany
    private Collection<String> typeVechile = new HashSet<>();

    @ManyToMany
    private Collection<String> rangeWorks = new HashSet<>();
    private String url;



    public Contractor( String name, String email, String password, Collection<String> phone, Address address, String avatar, Collection<String> typeServise, String fax, Map<Integer, WorkingHours> workingDays, Collection<String> typeVehicle, Collection<String> rangeWorks, String url) {
        super(Role.CONTRACTOR, name, email, password, phone, address, avatar);
        this.typeServise = typeServise;
        this.fax = fax;
        this.workingDays = workingDays;
        this.typeVechile = typeVehicle;
        this.rangeWorks = rangeWorks;
        this.url = url;
    }

    /* typeService */
    public void setTypeServise(Collection<String> typeServise) {
        this.typeServise.clear();
        this.typeServise.addAll(typeServise);
    }

    public Collection<String> getTypeServise() {
        return typeServise;
    }

    public void addTypeServise(String... typeServise) {
        if (typeServise.length > 0)
            this.typeServise.addAll(Arrays.asList(typeServise));
    }

    public boolean removeTypeServise(String... typeServise) {
        return typeServise.length > 0 && this.typeServise.removeAll(Arrays.asList(typeServise));
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

    /* typeVechile */
    public void setTypeVechile(Collection<String> typeVechile) {
        this.typeVechile.clear();
        this.typeVechile.addAll(typeVechile);
    }

    public Collection<String> getTypeVechile() {
        return typeVechile;
    }

    public void addTypeVechile(String... typeVechile) {
        if (typeVechile.length > 0)
            this.typeVechile.addAll(Arrays.asList(typeVechile));
    }

    public boolean removeTypeVechile(String... typeVechile) {
        return typeVechile.length > 0 && this.typeVechile.removeAll(Arrays.asList(typeVechile));
    }

    /* rangeWorks */
    public void setRangeWorks(Collection<String> rangeWorks) {
        this.rangeWorks.clear();
        this.rangeWorks.addAll(rangeWorks);
    }

    public Collection<String> getRangeWorks() {
        return rangeWorks;
    }

    public void addRangeWorks(String... rangeWorks) {
        if (rangeWorks.length > 0)
            this.rangeWorks.addAll(Arrays.asList(rangeWorks));
    }

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
}