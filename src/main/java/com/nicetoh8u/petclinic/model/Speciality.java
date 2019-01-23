package com.nicetoh8u.petclinic.model;

import lombok.*;

import javax.persistence.Entity;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Speciality extends BaseEntity {

    @Builder
    public Speciality(Long id, String description) {
        super(id);
        this.description = description;
    }

    String description;

}
