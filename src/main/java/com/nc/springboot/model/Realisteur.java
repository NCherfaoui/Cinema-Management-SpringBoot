package com.nc.springboot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "realisteur")
public class Realisteur {
  // L'annotation @Id indique que ce champ est la clé primaire de l'entité.
  @Id
  // L'annotation @SequenceGenerator définit une séquence de génération de clés primaires.
  @SequenceGenerator(
          name = "realisteur_sequence",
          sequenceName = "realisteur_sequence",
          allocationSize = 1 // L'incrémentation de la séquence.
  )
  // L'annotation @GeneratedValue indique que la valeur de la clé primaire sera générée automatiquement.
  @GeneratedValue(
          strategy = GenerationType.SEQUENCE,
          generator = "realisteur_sequence"
  )
  private Long id;
  private String nom;
  private String prenom;
  private String dateNaissance;

  @Basic
  private String photo;

  public Realisteur(String nom, String prenom, String dateNaissance, String photo) {
    this.nom = nom;
    this.prenom = prenom;
    this.dateNaissance = dateNaissance;
    this.photo = photo;
  }

  public Realisteur() {

  }

  @Override
  public String toString() {
    return "Realisteur{" +
            "id=" + id +
            ", nom='" + nom + '\'' +
            ", prenom='" + prenom + '\'' +
            ", dateNaissance='" + dateNaissance + '\'' +
            '}';
  }
}