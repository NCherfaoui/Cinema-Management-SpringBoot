package com.nc.springboot.service;

import com.nc.springboot.model.Acteur;
import com.nc.springboot.repository.ActeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// L'annotation @Service est utilisée pour indiquer que la classe est un service Spring.
@Service
public class ActeurService {

    // L'annotation @Autowired est utilisée pour l'injection de dépendances.
    // Ici, elle injecte une instance de ActeurRepository.
    @Autowired
    private ActeurRepository acteurRepository;

    // Cette méthode est utilisée pour obtenir tous les acteurs de la base de données.
    public List<Acteur> getAllActeurs() {
        return acteurRepository.findAll();
    }

    // Cette méthode est utilisée pour obtenir un acteur spécifique en fonction de son ID.
    public Acteur getActeurById(Long id) {
        return acteurRepository.findById(id).orElse(null);
    }

    // Cette méthode est utilisée pour ajouter un nouvel acteur à la base de données.
    public Acteur addActeur(Acteur acteur) {
        return acteurRepository.save(acteur);
    }

    // Cette méthode est utilisée pour mettre à jour un acteur existant dans la base de données.
    public Acteur updateActeur(Acteur acteur) {
        return acteurRepository.save(acteur);
    }

    // Cette méthode est utilisée pour supprimer un acteur spécifique de la base de données en fonction de son ID.
    public void deleteActeur(Long id) {
        acteurRepository.deleteById(id);
    }
    public Acteur createActeur(String nom, String prenom, String dateNaissance) {

        Acteur acteur = new Acteur(nom, prenom, dateNaissance);
        return acteurRepository.save(acteur);
    }
}