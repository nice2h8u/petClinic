package com.nicetoh8u.petclinic.repositories;

import com.nicetoh8u.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}