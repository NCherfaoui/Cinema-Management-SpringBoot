package com.nc.springboot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// Les annotations @Getter et @Setter de Lombok génèrent automatiquement les getters et setters pour tous les champs de l'entité.
@Getter
@Setter
// L'annotation @Entity indique que cette classe est une entité JPA.
@Entity
// L'annotation @Table spécifie le nom de la table à utiliser pour cette entité. Si aucun nom n'est spécifié, le nom de la classe sera utilisé.
@Table
public class Acteur {

    // L'annotation @Id indique que ce champ est la clé primaire de l'entité.
    @Id
    // L'annotation @SequenceGenerator définit une séquence de génération de clés primaires.
    @SequenceGenerator(
            name = "acteur_sequence",
            sequenceName = "acteur_sequence",
            allocationSize = 1 // L'incrémentation de la séquence.
    )
    // L'annotation @GeneratedValue indique que la valeur de la clé primaire sera générée automatiquement.
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "acteur_sequence"
    )
    private Long id;

    // Ces champs représentent les attributs de l'entité Acteur.
    private String nom;
    private String prenom;
    private String dateNaissance;

    // Constructeur par défaut requis par JPA.
    @Basic
    private String photo;

    public Acteur() {
    }
    // Constructeur pour créer une nouvelle instance de Acteur.

    public Acteur(String nom, String prenom, String dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public Acteur(String nom, String prenom, String dateNaissance, String photo) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.photo = photo;
    }
    // Méthode toString pour représenter l'entité Acteur sous forme de chaîne de caractères.

    @Override
    public String toString() {
        return "Acteur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                '}';
    }

}