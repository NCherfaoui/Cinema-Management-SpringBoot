package com.nc.springboot.repository;

import com.nc.springboot.model.Acteur;
import org.springframework.data.jpa.repository.JpaRepository;

// L'annotation @Repository n'est pas nécessaire ici car JpaRepository contient déjà cette annotation.
// Cependant, vous pouvez l'ajouter pour plus de clarté.
// @Repository
public interface ActeurRepository extends JpaRepository<Acteur, Long> {
    // Cette interface hérite de JpaRepository qui contient des méthodes pour les opérations CRUD standard.
    // Le premier paramètre de JpaRepository est le type de l'entité pour laquelle le repository est créé.
    // Le deuxième paramètre est le type de l'ID de l'entité.

    // Vous pouvez définir des méthodes personnalisées pour des requêtes spécifiques ici.
    // Par exemple, pour trouver un Acteur par son nom, vous pouvez ajouter la méthode suivante :
    // Acteur findByName(String name);
}