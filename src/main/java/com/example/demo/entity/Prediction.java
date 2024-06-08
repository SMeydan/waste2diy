package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Prediction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int waste_id;
    private String url1;
    private String url2;
    private String url3;

    public Prediction() {
    }

    public Prediction(int waste_id, String url1, String url2, String url3) {
        this.waste_id = waste_id;
        this.url1 = url1;
        this.url2 = url2;
        this.url3 = url3;
    }

    public Prediction(int id, int waste_id, String url1, String url2, String url3) {
        this.id = id;
        this.waste_id = waste_id;
        this.url1 = url1;
        this.url2 = url2;
        this.url3 = url3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWaste_id() {
        return waste_id;
    }

    public void setWaste_id(int waste_id) {
        this.waste_id = waste_id;
    }

    public String getUrl1() {
        return url1;
    }

    public void setUrl1(String url1) {
        this.url1 = url1;
    }

    public String getUrl2() {
        return url2;
    }

    public void setUrl2(String url2) {
        this.url2 = url2;
    }

    public String getUrl3() {
        return url3;
    }

    public void setUrl3(String url3) {
        this.url3 = url3;
    }

    @Override
    public String toString() {
        return "Prediction{" +
                "id=" + id +
                ", waste_id=" + waste_id +
                ", url1='" + url1 + '\'' +
                ", url2='" + url2 + '\'' +
                ", url3='" + url3 + '\'' +
                '}';
    }
}
