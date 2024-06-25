package com.nc.springboot.controller;

import com.nc.springboot.model.Acteur;
import com.nc.springboot.service.ActeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// Controller pour la partie API REST de l'application.
// L'annotation @RestController indique que cette classe est un contrôleur REST.
@RestController
// L'annotation @RequestMapping spécifie l'URL de base pour toutes les méthodes du contrôleur.
@RequestMapping("/api/acteurs")
public class ActeurApiController {

    // L'annotation @Autowired est utilisée pour l'injection de dépendances.
    // Ici, elle injecte une instance de ActeurService.
    @Autowired
    private ActeurService acteurService;

    // Cette méthode est utilisée pour obtenir tous les acteurs.
    @GetMapping
    public List<Acteur> getAllActeurs() {
        return acteurService.getAllActeurs();
    }

    // Cette méthode est utilisée pour obtenir un acteur spécifique en fonction de son ID.
    @GetMapping("/{id}")
    public Acteur getActeurById(@PathVariable Long id) {
        return acteurService.getActeurById(id);
    }

    // Cette méthode est utilisée pour ajouter un nouvel acteur à la base de données.
    @PostMapping
    public Acteur addActeur(@RequestBody Acteur acteur) {
        return acteurService.addActeur(acteur);
    }

    // Cette méthode est utilisée pour mettre à jour un acteur existant dans la base de données.
    @PutMapping("/{id}")
    public Acteur updateActeur(@PathVariable Long id, @RequestBody Acteur acteur) {
        return acteurService.updateActeur(acteur);
    }

    // Cette méthode est utilisée pour supprimer un acteur spécifique de la base de données en fonction de son ID.
    @DeleteMapping("/{id}")
    public void deleteActeur(@PathVariable Long id) {
        acteurService.deleteActeur(id);
    }
}
