package com.model;

import com.TypeService;
import sun.security.util.Password;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Oleg on 02.09.2016.
 */
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"name"}))
public class Contractor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToMany
    private Collection<TypeService> typeServise;
    private String email;
    private Password password;

    @ElementCollection
    private Set<String> phone = new HashSet<>();
    private String fax;

    @OneToOne
    private Address address;

    @ManyToMany
    private Collection<String> typeVechile