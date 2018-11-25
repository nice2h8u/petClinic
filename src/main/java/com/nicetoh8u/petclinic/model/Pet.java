package com.nicetoh8u.petclinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"petType","owner","visits"})
@Entity
public class Pet extends BaseEntity {


    @ManyToOne
    @JoinColumn(name = "pet_type_id")
    private PetType petType;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
    private LocalDate birthDate;
    private String name;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "pet")
    private Set<Visit> visits = new HashSet<>();

}
