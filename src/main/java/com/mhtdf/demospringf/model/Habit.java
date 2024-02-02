package com.mhtdf.demospringf.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Habit {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "habit")
    private Set<Activity> activitites;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
