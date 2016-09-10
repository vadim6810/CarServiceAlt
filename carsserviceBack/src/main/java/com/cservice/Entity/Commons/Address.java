package com.cservice.Entity.Commons;

import javax.persistence.Embeddable;
import java.util.Collection;

@Embeddable
public class Address {

  //  private int id;
    private Collection<String> city;
    private Collection<String> area;
    private String street;
    private String house;
    private String txt_house;

    public Address(){}

    public Address(/*int id, */Collection<String> city, Collection<String> area, String street, String house, String txt_house) {
       // this.id = id;
        this.city = city;
        this.area = area;
        this.street = street;
        this.house = house;
        this.txt_house = txt_house;
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public Collection<String> getCity() {
        return city;
    }

    public void setCity(Collection<String> city) {
        this.city = city;
    }

    public Collection<String> getArea() {
        return area;
    }

    public void setArea(Collection<String> area) {
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getTxt_house() {
        return txt_house;
    }

    public void setTxt_house(String txt_house) {
        this.txt_house = txt_house;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city=" + city +
                ", area=" + area +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", txt_house='" + txt_house + '\'' +
                '}';
    }
}
