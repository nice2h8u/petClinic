package com.nicetoh8u.petclinic.model;

import lombok.*;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.MappedSuperclass;


@Data
@MappedSuperclass
public class Person extends BaseEntity {



    private String firstName;
    private String lastName;


}
