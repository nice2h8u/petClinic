package com.nicetoh8u.petclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import java.time.LocalDate;

@Data
@EqualsAndHashCode(exclude = {"pet"})
@Entity
public class Visit extends BaseEntity {

    private LocalDate localDate;
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

}
