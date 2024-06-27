package com.nc.springboot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "film")
public class Film {
    @GeneratedValue
    @Id
    private Long id;

    @Basic
    private String titre;

    @Basic
    private String affiche;

    @Basic
    private LocalDate date_sortie;

    public Film() {
    }

    public Film(String titre, String affiche, LocalDate date_sortie) {
        this.titre = titre;
        this.affiche = affiche;
        this.date_sortie = date_sortie;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", affiche='" + affiche + '\'' +
                ", date_sortie=" + date_sortie +
                '}';
    }
}