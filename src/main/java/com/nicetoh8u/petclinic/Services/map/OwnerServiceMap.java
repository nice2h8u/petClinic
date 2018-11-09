package com.nicetoh8u.petclinic.Services.map;

import com.nicetoh8u.petclinic.Services.CrudService;
import com.nicetoh8u.petclinic.model.Owner;

import java.util.Set;

public class OwnerServiceMap extends AbtractMapService<Owner,Long> implements CrudService<Owner,Long> {
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
            super.delete(object);
    }
}
