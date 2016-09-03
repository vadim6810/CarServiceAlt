package com.cservice.Entity.Commons;

import javax.persistence.Embeddable;
import java.util.Collection;

@Embeddable
public class Address {
    private int id;
    private Collection<String> city;
    private Collection<String> area;
    private String street;
    private String house;
    private String txt_house;
}
