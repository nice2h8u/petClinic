package com.nicetoh8u.petclinic.Services;

import com.nicetoh8u.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
