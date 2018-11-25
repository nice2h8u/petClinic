package com.nicetoh8u.petclinic.model;

import lombok.*;

import javax.persistence.Entity;

@Data
@Entity
public class Speciality extends BaseEntity {

    String description;

}
