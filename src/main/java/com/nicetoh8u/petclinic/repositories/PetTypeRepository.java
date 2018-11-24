package com.nicetoh8u.petclinic.repositories;

import com.nicetoh8u.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository <PetType,Long> {
}
