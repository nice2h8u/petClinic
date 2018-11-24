package com.nicetoh8u.petclinic.services.map;

import com.nicetoh8u.petclinic.model.Pet;
import com.nicetoh8u.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class PetServiceMap extends AbtractMapService<Pet,Long> implements PetService {


    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }
    @Override
    public void deleteById(Long aLong) {
        super.deleteByID(aLong);
    }
    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
}
