package com.nicetoh8u.petclinic.model;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"pets"})
@Entity
public class Owner extends Person {

    private String telephone;
    private String address;
    private String city;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")//if delete owner the pets is also will be deleted
    private Set<Pet> pets = new HashSet<>();


}
