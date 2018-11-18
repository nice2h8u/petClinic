package com.nicetoh8u.petclinic.services.map;

import com.nicetoh8u.petclinic.model.Speciality;
import com.nicetoh8u.petclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityServiceMap extends AbtractMapService<Speciality,Long> implements SpecialityService {
    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }
    @Override
    public void deleteById(Long aLong) {
        super.deleteByID(aLong);
    }
}
