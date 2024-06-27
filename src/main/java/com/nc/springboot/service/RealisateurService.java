package com.nc.springboot.service;

import com.nc.springboot.model.Realisteur;
import com.nc.springboot.repository.RealisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RealisateurService {
    @Autowired
    private RealisateurRepository realisteurRepository;

    public void createRealisateur(String nom, String prenom, String dateNaissance, String photo) {

        Realisteur realisteur = new Realisteur(nom, prenom, dateNaissance, photo);
        realisteurRepository.save(realisteur);
    }

    public Realisteur getRealisateurById(Long id) {
        return realisteurRepository.findById(id).orElse(null);
    }

    public void deleteRealisateur(Long id) {
        realisteurRepository.deleteById(id);
    }

    public Realisteur updateRealisateur(Realisteur realisteur) {
        return realisteurRepository.save(realisteur);
    }

    public Iterable<Realisteur> getAllRealisateurs() {
        return realisteurRepository.findAll();
    }

    public Realisteur addRealisateur(Realisteur realisteur) {
        return realisteurRepository.save(realisteur);
    }

    public void deleteAllRealisateurs() {
        realisteurRepository.deleteAll();
    }


}
