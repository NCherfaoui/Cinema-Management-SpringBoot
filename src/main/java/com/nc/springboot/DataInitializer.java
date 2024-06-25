package com.nc.springboot;

import com.nc.springboot.service.ActeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private ActeurService acteurService;

    @Override
    public void run(String... args) throws Exception {
        if (acteurService.getAllActeurs().isEmpty()) {


//        INSERT INTO Acteur (nom, prenom, date_naissance) VALUES ('De Niro', 'Robert', '1943-08-17');
//        INSERT INTO Acteur (nom, prenom, date_naissance) VALUES ('Pacino', 'Al', '1940-04-25');
//        INSERT INTO Acteur (nom, prenom, date_naissance) VALUES ('Streep', 'Meryl', '1949-06-22');
//        INSERT INTO Acteur (nom, prenom, date_naissance) VALUES ('Hanks', 'Tom', '1956-07-09');
//        INSERT INTO Acteur (nom, prenom, date_naissance) VALUES ('Blanchett', 'Cate', '1969-05-14');
//        INSERT INTO Acteur (nom, prenom, date_naissance) VALUES ('Cruise', 'Tom', '1962-07-03');

        acteurService.createActeur("De Niro", "Robert", "1943-08-17");
        acteurService.createActeur("Pacino", "Al", "1940-04-25");
        acteurService.createActeur("Streep", "Meryl", "1949-06-22");
        acteurService.createActeur("Hanks", "Tom", "1956-07-09");
        acteurService.createActeur("Blanchett", "Cate", "1969-05-14");
        acteurService.createActeur("Cruise", "Tom", "1962-07-03");

    }
}
}