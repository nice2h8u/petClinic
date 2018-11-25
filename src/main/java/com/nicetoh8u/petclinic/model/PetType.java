package com.nicetoh8u.petclinic.model;

import lombok.*;

import javax.persistence.Entity;

@Data
@Entity
public class PetType extends BaseEntity {

    private String name;

}
