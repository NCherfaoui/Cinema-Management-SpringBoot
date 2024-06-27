package com.nc.springboot;

import com.nc.springboot.service.ActeurService;
import com.nc.springboot.service.GenreService;
import com.nc.springboot.service.RealisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private ActeurService acteurService;
    @Autowired
    private GenreService genreService;
    @Autowired
    private RealisateurService realisateurService;

    @Override
    public void run(String... args) throws Exception {
        if (acteurService.getAllActeurs().isEmpty()) {


//        INSERT INTO Acteur (nom, prenom, date_naissance) VALUES ('De Niro', 'Robert', '1943-08-17');
//        INSERT INTO Acteur (nom, prenom, date_naissance) VALUES ('Pacino', 'Al', '1940-04-25');
//        INSERT INTO Acteur (nom, prenom, date_naissance) VALUES ('Streep', 'Meryl', '1949-06-22');
//        INSERT INTO Acteur (nom, prenom, date_naissance) VALUES ('Hanks', 'Tom', '1956-07-09');
//        INSERT INTO Acteur (nom, prenom, date_naissance) VALUES ('Blanchett', 'Cate', '1969-05-14');
//        INSERT INTO Acteur (nom, prenom, date_naissance) VALUES ('Cruise', 'Tom', '1962-07-03');

        acteurService.createActeur("De Niro", "Robert", "1943-08-17","https://upload.wikimedia.org/wikipedia/commons/3/3c/Robert_De_Niro_Cannes_2016.jpg");
        acteurService.createActeur("Pacino", "Al", "1940-04-25","https://upload.wikimedia.org/wikipedia/commons/9/9d/Al_Pacino.jpg");
        acteurService.createActeur("Streep", "Meryl", "1949-06-22","https://upload.wikimedia.org/wikipedia/commons/5/5d/Meryl_Streep_by_Jack_Mitchell.jpg");
        acteurService.createActeur("Hanks", "Tom", "1956-07-09","https://upload.wikimedia.org/wikipedia/commons/6/69/Tom_Hanks_2014.jpg");
        acteurService.createActeur("Blanchett", "Cate", "1969-05-14","https://upload.wikimedia.org/wikipedia/commons/0/0b/Cate_Blanchett.jpg");
        acteurService.createActeur("Cruise", "Tom", "1962-07-03","https://upload.wikimedia.org/wikipedia/commons/7/7e/Tom_Cruise_by_Gage_Skidmore.jpg");
        genreService.createGenre("Action");
        genreService.createGenre("Comédie");
        genreService.createGenre("Drame");
        genreService.createGenre("Policier");
        genreService.createGenre("Romantique");
        genreService.createGenre("Thriller");
        realisateurService.createRealisateur("Scorsese", "Martin", "1942-11-17","https://upload.wikimedia.org/wikipedia/commons/4/4d/Martin_Scorsese_Berlinale_2010_%28cropped%29.jpg");
        realisateurService.createRealisateur("Eastwood", "Clint", "1930-05-31","https://upload.wikimedia.org/wikipedia/commons/4/4e/Clint_Eastwood_Cannes_2017.jpg");
        realisateurService.createRealisateur("Tarantino", "Quentin", "1963-03-27","https://upload.wikimedia.org/wikipedia/commons/8/82/Quentin_Tarantino_by_Gage_Skidmore.jpg");
        realisateurService.createRealisateur("Spielberg", "Steven", "1946-12-18","https://upload.wikimedia.org/wikipedia/commons/3/3c/Steven_Spielberg_Cannes_2017.jpg");





    }
}
}