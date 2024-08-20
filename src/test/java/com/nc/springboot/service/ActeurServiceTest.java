package com.nc.springboot.service;

import com.nc.springboot.model.Acteur;
import com.nc.springboot.repository.ActeurRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@ExtendWith(MockitoExtension.class)
public class ActeurServiceTest {
    @Mock
    private ActeurRepository acteurRepository;
    @InjectMocks
    private ActeurService acteurService;

    @Test
    public void testGetAllActeurs() {
        when(acteurRepository.findAll()).thenReturn(Arrays.asList(
                new Acteur("John", "Doe", "01/01/1970", "john_doe.jpg"),
                new Acteur("Jane", "Doe", "01/01/1975", "jane_doe.jpg")
        ));
        List<Acteur> result = acteurService.getAllActeurs();
        assertEquals("John", result.get(0).getNom());

    }


    @Test
    void getAllActeurs() {
    }

    @Test
    void getActeurById() {
    }

    @Test
    void addActeur() {
    }

    @Test
    void updateActeur() {
    }

    @Test
    void createActeur() {
    }
}