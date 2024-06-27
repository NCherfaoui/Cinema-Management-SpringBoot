package com.nc.springboot.controller;

import com.nc.springboot.model.Acteur;
import com.nc.springboot.service.ActeurService;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ActeurViewControllerTest {

    @Test
    void getAllActeurs() {
        // Création d'une instance simulée de ActeurService
        ActeurService acteurService = mock(ActeurService.class);

        // Création d'une liste d'acteurs
        List<Acteur> acteurs = Arrays.asList(new Acteur(), new Acteur());

        // Définition du comportement du service simulé
        when(acteurService.getAllActeurs()).thenReturn(acteurs);

        // Création d'une instance de ActeurViewController et injection du service simulé
        ActeurViewController controller = new ActeurViewController(acteurService);

        // Appel de la méthode à tester
        Model model = new BindingAwareModelMap();
        String viewName = controller.getAllActeurs(model);

        // Vérification du résultat
        assertEquals("acteurs", viewName);
        assertSame(acteurs, model.getAttribute("acteurs"));
    }

    @Test
    void showAddActeurForm() {
        // Création d'une instance simulée de ActeurService
        ActeurService acteurService = mock(ActeurService.class);

        // Création d'une instance de ActeurViewController et injection du service simulé
        ActeurViewController controller = new ActeurViewController(acteurService);

        // Appel de la méthode à tester
        Model model = new BindingAwareModelMap();
        String viewName = controller.showAddActeurForm(model);

        // Vérification du résultat
        assertEquals("add-acteur", viewName);
        assertInstanceOf(Acteur.class, model.getAttribute("acteur"));
    }

    // Vous pouvez ajouter d'autres méthodes de test pour les autres méthodes du contrôleur

    @Test
    void addActeur() {
        // Création d'une instance simulée de ActeurService
        ActeurService acteurService = mock(ActeurService.class);

        // Création d'une instance de ActeurViewController et injection du service simulé
        ActeurViewController controller = new ActeurViewController(acteurService);

        // Création d'un nouvel acteur
        Acteur acteur = new Acteur();

        // Appel de la méthode à tester
        String viewName = controller.addActeur(acteur);

        // Vérification du résultat
        assertEquals("redirect:/acteurs", viewName);
        verify(acteurService, times(1)).addActeur(acteur);
    }
}