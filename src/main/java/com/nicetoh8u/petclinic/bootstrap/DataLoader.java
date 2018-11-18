package com.nicetoh8u.petclinic.bootstrap;

import com.nicetoh8u.petclinic.model.*;
import com.nicetoh8u.petclinic.services.OwnerService;
import com.nicetoh8u.petclinic.services.PetTypeService;
import com.nicetoh8u.petclinic.services.SpecialityService;
import com.nicetoh8u.petclinic.services.VetService;
import com.nicetoh8u.petclinic.services.map.OwnerServiceMap;
import com.nicetoh8u.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        if (petTypeService.findAll().size() == 0)
            loadData();
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDog = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("cat");
        PetType savedCat = petTypeService.save(cat);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality radioLogy = new Speciality();
        radioLogy.setDescription("Radiology");
        Speciality savedRadilogy = specialityService.save(radioLogy);

        Speciality dentisrty = new Speciality();
        dentisrty.setDescription("Dentisrty");
        Speciality savedDentisrty = specialityService.save(dentisrty);

        Owner owner = new Owner();
        owner.setFirstName("Ilya");
        owner.setLastName("Kudryavtsev");
        owner.setAddress("Serova Street");
        owner.setCity("Rybinsk");
        owner.setTelephone("228599");

        ownerService.save(owner);

        owner = new Owner();
        owner.setFirstName("Djim");
        owner.setLastName("Carry");
        owner.setAddress("Holywood street 16");
        owner.setCity("New York");
        owner.setTelephone("+2931354321");

        ownerService.save(owner);

        Pet ilyasPet = new Pet();
        ilyasPet.setPetType(savedDog);
        ilyasPet.setBirthDate(LocalDate.now());
        ilyasPet.setOwner(ownerService.findById(1L));
        ilyasPet.setName("Sharik");

        ownerService.findById(1L).getPets().add(ilyasPet);

        Pet djimPet = new Pet();
        djimPet.setPetType(savedCat);
        djimPet.setBirthDate(LocalDate.now());
        djimPet.setOwner(ownerService.findById(2L));
        djimPet.setName("Murka");
        ownerService.findById(2L).getPets().add(djimPet);


        Vet vet = new Vet();


        vet.setFirstName("Doctor");
        vet.setLastName("Popov");

        vetService.save(vet);
        vetService.findById(1L).getSpecialities().add(savedRadilogy);

        vet = new Vet();

        vet.setFirstName("Doctor");
        vet.setLastName("Aybolit");

        vetService.save(vet);
        vetService.findById(2L).getSpecialities().add(savedSurgery);
    }
}
