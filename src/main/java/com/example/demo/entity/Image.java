package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int waste_id;
    private String URL;

    public Image() {
    }

    public Image(int waste_id, String URL) {
        this.waste_id = waste_id;
        this.URL = URL;
    }

    public Image(Long id, int waste_id, String URL) {
        this.id = id;
        this.waste_id = waste_id;
        this.URL = URL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getWaste_id() {
        return waste_id;
    }

    public void setWaste_id(int waste_id) {
        this.waste_id = waste_id;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", waste_id=" + waste_id +
                ", URL='" + URL + '\'' +
                '}';
    }
}
