package com.nicetoh8u.petclinic.services.map;

import com.nicetoh8u.petclinic.services.CrudService;
import com.nicetoh8u.petclinic.model.Vet;
import com.nicetoh8u.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbtractMapService<Vet,Long> implements VetService {

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
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
