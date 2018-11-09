package com.nicetoh8u.petclinic.Services.map;

import com.nicetoh8u.petclinic.Services.CrudService;
import com.nicetoh8u.petclinic.model.Pet;

import java.util.Set;

public class PetServiceMap extends AbtractMapService<Pet,Long> implements CrudService<Pet,Long> {


    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
}
