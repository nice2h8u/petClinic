package com.nicetoh8u.petclinic.services.map;

import com.nicetoh8u.petclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    final Long ownerId=1L;
    final String lastName = "Kudryavtsev";

    OwnerServiceMap ownerServiceMap;

    @BeforeEach
    void setUp() {

        ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap(),new PetServiceMap());
        ownerServiceMap.save(Owner.builder().id(ownerId).lastName(lastName).build());

    }

    @Test
    void findById() {
        Owner owner = ownerServiceMap.findById(ownerId);
        assertEquals(ownerId,owner.getId());
    }

    @Test
    void saveExistingId() {
        Long id = 2L;

        Owner savingOwner = Owner.builder().id(id).build();
        ownerServiceMap.save(savingOwner);

        assertEquals(id,savingOwner.getId());
    }

    @Test
    void saveNoId() {


        Owner savingOwner = Owner.builder().build();
        ownerServiceMap.save(savingOwner);

        assertNotNull(savingOwner);
        assertNotNull(savingOwner.getId() );
    }

    @Test
    void findAll() {
        Set <Owner> owners = ownerServiceMap.findAll();
        assertEquals(1,owners.size());
    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));

        assertEquals(0,ownerServiceMap.findAll().size());
    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);
        assertEquals(0,ownerServiceMap.findAll().size());
    }

    @Test
    void findByLastName() {
        Owner owner = ownerServiceMap.findByLastName(lastName);

        assertNotNull(owner);
        assertEquals(lastName,owner.getLastName());
    }

    @Test
    void findNotExistingLastName() {
        Owner owner = ownerServiceMap.findByLastName("Serov");

        assertNull(owner);

    }
}