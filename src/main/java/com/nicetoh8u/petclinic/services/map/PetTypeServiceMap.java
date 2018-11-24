package com.nicetoh8u.petclinic.services.map;

import com.nicetoh8u.petclinic.model.PetType;
import com.nicetoh8u.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class PetTypeServiceMap extends AbtractMapService<PetType,Long> implements PetTypeService {
    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }
    @Override
    public void deleteById(Long aLong) {
        super.deleteByID(aLong);
    }
    @Override
    public void delete(PetType object) {
            super.delete(object);
    }
}
