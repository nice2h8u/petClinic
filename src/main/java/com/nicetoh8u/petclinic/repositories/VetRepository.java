package com.nicetoh8u.petclinic.repositories;

import com.nicetoh8u.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository <Vet,Long> {
}
