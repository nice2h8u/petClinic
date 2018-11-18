package com.nicetoh8u.petclinic.services.map;

import com.nicetoh8u.petclinic.model.Speciality;
import com.nicetoh8u.petclinic.services.CrudService;
import com.nicetoh8u.petclinic.model.Vet;
import com.nicetoh8u.petclinic.services.SpecialityService;
import com.nicetoh8u.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbtractMapService<Vet, Long> implements VetService {

    SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities().size()>0){
            object.getSpecialities().forEach(speciality -> {
                if (speciality.getId() == null){
                    Speciality saveSpeciality = specialityService.save(speciality);
                    speciality.setId(saveSpeciality.getId());
                }
            });
        }

        return super.save(object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteByID(aLong);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
