package com.nicetoh8u.petclinic.repositories;

import com.nicetoh8u.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository <Speciality, Long> {
}
