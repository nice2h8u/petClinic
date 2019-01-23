package com.nicetoh8u.petclinic.model;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"pets"})
@Entity
public class Owner extends Person {

    private String telephone;
    private String address;
    private String city;

    @Builder
    public Owner(Long id, String firstName, String lastName, String address, String city,
                 String telephone, Set<Pet> pets) {
        super(id, firstName, lastName);
        this.address = address;
        this.city = city;
        this.telephone = telephone;

        if(pets != null) {
            this.pets = pets;
        }
    }

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")//if delete owner the pets is also will be deleted
    private Set<Pet> pets = new HashSet<>();


}
