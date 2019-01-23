package com.nicetoh8u.petclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"pet"})
@Entity
public class Visit extends BaseEntity {

    @Builder
    public Visit(Long id, LocalDate localDate, String description, Pet pet) {
        super(id);
        this.localDate = localDate;
        this.description = description;
        this.pet = pet;
    }

    private LocalDate localDate;
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

}
