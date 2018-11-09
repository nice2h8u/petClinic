package com.nicetoh8u.petclinic.Services.map;

import com.nicetoh8u.petclinic.Services.CrudService;
import com.nicetoh8u.petclinic.model.Vet;

import java.util.Set;

public class VetServiceMap extends AbtractMapService<Vet,Long> implements CrudService<Vet,Long> {

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
