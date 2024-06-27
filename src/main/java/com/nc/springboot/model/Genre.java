package com.nc.springboot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "genre")
public class Genre {
    @GeneratedValue
    @Id
    private Long id;

    @Basic
    private String nom;

    public Genre(String nom) {
        this.nom = nom;
    }

    public Genre() {

    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}