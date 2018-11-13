package com.nicetoh8u.petclinic.bootstrap;

import com.nicetoh8u.petclinic.model.Owner;
import com.nicetoh8u.petclinic.model.Vet;
import com.nicetoh8u.petclinic.services.OwnerService;
import com.nicetoh8u.petclinic.services.VetService;
import com.nicetoh8u.petclinic.services.map.OwnerServiceMap;
import com.nicetoh8u.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();


        owner.setFirstName("Ilya");
        owner.setLastName("Kudryavtsev");

        ownerService.save(owner);

        owner = new Owner();


        owner.setFirstName("Djim");
        owner.setLastName("Carry");

        ownerService.save(owner);

        Vet vet = new Vet();


        vet.setFirstName("Doctor");
        vet.setLastName("Popov");

        vetService.save(vet);

        vet = new Vet();

        vet.setFirstName("Doctor");
        vet.setLastName("Aybolit");

        vetService.save(vet);
    }
}
