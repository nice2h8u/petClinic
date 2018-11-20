package com.nicetoh8u.petclinic.model;

import javax.persistence.Entity;

@Entity
public class Speciality extends BaseEntity {

    String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
