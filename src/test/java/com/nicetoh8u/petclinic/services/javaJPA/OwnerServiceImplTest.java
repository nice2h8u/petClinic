package com.nicetoh8u.petclinic.services.javaJPA;

import com.nicetoh8u.petclinic.model.Owner;
import com.nicetoh8u.petclinic.repositories.OwnerRepository;
import com.nicetoh8u.petclinic.repositories.PetRepository;
import com.nicetoh8u.petclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class OwnerServiceImplTest {

   final String lastName = "Kudryavtsev";
    @Mock
     OwnerRepository ownerRepository;
    @Mock
     PetRepository petRepository;
    @Mock
     PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerServiceImpl ownerService;

    Owner owner;

    @BeforeEach
    void setUp() {
     owner = Owner.builder().id(1L).lastName(lastName).build();
    }

    @Test
    void findByLastName() {




        Mockito.when(ownerRepository.findByLastName(Mockito.any())).thenReturn(owner);

        Owner testingOwner = ownerService.findByLastName(lastName);

        assertEquals(owner.getLastName(),testingOwner.getLastName());

        Mockito.verify(ownerRepository).findByLastName(Mockito.any());
    }

    @Test
    void findById() {

        Mockito.when(ownerRepository.findById(Mockito.any())).thenReturn(Optional.of(owner));

        Owner testingOwner = ownerService.findById(1L);

        assertNotNull(testingOwner);
    }

    @Test
    void findNotExistingId() {

        Mockito.when(ownerRepository.findById(Mockito.any())).thenReturn(Optional.empty());

        Owner testingOwner = ownerService.findById(1L);

        assertNull(testingOwner);
    }

    @Test
    void save() {

        Mockito.when(ownerRepository.save(Mockito.any())).thenReturn(owner);

        Owner tesingOwner =  ownerService.save(owner);

        assertNotNull(tesingOwner);
        //verify, that saving was accepted
       Mockito.verify(ownerRepository).save(Mockito.any());
    }

    @Test
    void findAll() {

        Set<Owner> owners = new HashSet<>();
        owners.add(Owner.builder().id(1L).lastName("g").build());
        owners.add(Owner.builder().id(2L).build());

        Mockito.when(ownerRepository.findAll()).thenReturn(owners);

        Set <Owner> testingOwner = ownerService.findAll();

        assertNotNull(testingOwner);
        assertEquals(owners.size(),testingOwner.size());

    }

    @Test
    void delete() {
        ownerService.delete(owner);
        Mockito.verify(ownerRepository,Mockito.times(1)).delete(Mockito.any());


    }

    @Test
    void deleteById() {
        ownerService.deleteById(owner.getId());
        Mockito.verify(ownerRepository,Mockito.times(1)).deleteById(Mockito.anyLong());
    }
}