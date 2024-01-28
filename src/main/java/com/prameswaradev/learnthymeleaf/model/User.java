package com.prameswaradev.learnthymeleaf.model;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String city;

    private Integer role;

    public User(UUID id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public User(UUID id, String name, String city, Integer role) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.role = role;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}
