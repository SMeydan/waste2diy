package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Waste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int user_id;
    private String name;

    public Waste() {

    }

    public Waste(int id,int user_id,String name) {
        this.id = id;
        this.user_id = user_id;
        this.name = name;
    }

    public Waste(int user_id,String name) {
        this.user_id = user_id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Waste{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", name='" + name + '\'' +
                '}';
    }
}
