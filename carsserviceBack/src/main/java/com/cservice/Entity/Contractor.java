package com.cservice.Entity;

import com.cservice.Entity.Commons.Account;
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
    @Column(name="dayOfWeek", nullable = false)
    private Map<Integer, WorkingHours> workingDays = new HashMap<>();

    @ManyToMany
    private Collection<String> typeVechile = new HashSet<>();

    @ManyToMany
    private Collection<String> rangeWorks = new HashSet<>();
    private String url;

    public Contractor() {
        setRole(CONTRACTOR);
    }

    public Collection<String> getTypeServise() {
        return typeServise;
    }

    public void addTypeServise(String... typeServise) {
        if (typeServise.length > 0)
            this.typeServise.addAll(Arrays.asList(typeServise));
    }

    public boolean removeTypeServise(String... typeServise) {
        if (typeServise.length > 0)
            return this.typeServise.removeAll(Arrays.asList(typeServise));
        else
            return false;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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

    public Collection<String> getTypeVechile() {
        return typeVechile;
    }

    public void addTypeVechile(String... typeVechile) {
        if (typeVechile.length > 0)
            this.typeVechile.addAll(Arrays.asList(typeVechile));
    }

    public boolean removeTypeVechile(String... typeVechile) {
        if (typeVechile.length > 0)
            return this.typeVechile.removeAll(Arrays.asList(typeVechile));
        else
            return false;
    }

    public Collection<String> getRangeWorks() {
        return rangeWorks;
    }

    public void addRangeWorks(String... rangeWorks) {
        if (rangeWorks.length > 0)
            this.rangeWorks.addAll(Arrays.asList(rangeWorks));
    }

    public boolean removeRangeWorks(String... rangeWorks) {
        if (rangeWorks.length > 0)
            return this.rangeWorks.removeAll(Arrays.asList(rangeWorks));
        else
            return false;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}