package com.nicetoh8u.petclinic.controllers;

import com.nicetoh8u.petclinic.model.Owner;
import com.nicetoh8u.petclinic.services.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {
    @Mock
    OwnerService ownerService;


    @InjectMocks
    OwnerController ownerController;

    MockMvc mockMvc;


    @BeforeEach
    void setUp() {




        mockMvc = MockMvcBuilders
                .standaloneSetup(ownerController)
                .build();
    }

    @Test
    void getOwners() throws Exception    {
        Set<Owner> set = new HashSet<>();
        set.add(Owner.builder().id(2L).lastName("y").build());
        set.add(Owner.builder().id(3L).build());

        Mockito.when(ownerService.findAll()).thenReturn(set);

        mockMvc.perform(get("/owners/")).andExpect(status().isOk())
        .andExpect(view().name("owners"));
        //.andExpect(model().attribute("owners",hasSize(2)));

    }
}