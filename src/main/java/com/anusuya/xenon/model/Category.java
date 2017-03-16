package com.anusuya.xenon.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by anusuya on 3/15/2017.
 */

@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    private String type;
    private String measurement;
    private String description;

    @OneToMany(mappedBy = "category")
//    @OneToMany
    private Set<Xen> xens;

    public Category(String type, String measurement, String description) {
        this.type = type;
        this.measurement = measurement;
        this.description = description;
    }

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Xen> getXens() {
        return xens;
    }

    public void setXens(Set<Xen> xens) {
        this.xens = xens;
    }
}
