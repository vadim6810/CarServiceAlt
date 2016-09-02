package com;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Admin on 02.09.2016.
 */
@Entity
public class TypeService {
    @Id
    private String name;

    public TypeService() {
    }

    public TypeService(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
