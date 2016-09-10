package com.cservice.Entity.Commons;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * Entity inheritance details http://docs.oracle.com/javaee/6/tutorial/doc/bnbqn.html
 *
 * @Inheritance(strategy = InheritanceType.JOINED) ==> 3 table (Account, Client, Contractor)
 * advantage (as minimum): unique name constraint for union Client+Contractor
 * Annotation @MappedSuperclass or @Entity required, otherwise the Account fields will nonpersistents.
 */

@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"name"}),
}
)
public abstract class Account implements Serializable {
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    @JsonProperty("role")
    private Role role;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;

    @Column(nullable = false)
    @JsonProperty("password")
    private String password;

    @ElementCollection
    @JsonProperty("phone")
    private Collection<String> phone = new HashSet<>(); //different from uml, Collection<String> instead of String

    @Embedded
    @JsonProperty("address")
    private Address address;
    @JsonProperty("avatar")
    private String avatar;

    public Account() {
    }

    public Account(Role role, String name, String email, String password, Collection<String> phone, Address address, String avatar) {
        this.role = role;
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.avatar = avatar;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //different from uml, Collection<String> instead of String
    public Collection<String> getPhone() {
        return phone;
    }

    //uml extension (String... argument in place of String), instead of setter
    public void addPhone(String... phone) {
        if (phone.length > 0)
            this.phone.addAll(Arrays.asList(phone));
    }

    //uml extension (String... argument in place of String), instead of setter
    public boolean removePhone(String... phone) {
        if (phone.length > 0)
            return this.phone.removeAll(Arrays.asList(phone));
        else
            return false;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
