package com.nc.springboot.service;

import com.nc.springboot.model.Genre;
import com.nc.springboot.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {
@Autowired
    private GenreRepository genreRepository;
public void createGenre(String nom) {

    Genre genre = new Genre(nom);
    genreRepository.save(genre);
}

    public Genre getGenreById(Long id) {
        return genreRepository.findById(id).orElse(null);
    }
    public Genre addGenre(Genre genre) {
        return genreRepository.save(genre);
    }
    public void deleteGenre(Long id) {
        genreRepository.deleteById(id);
    }

    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }
    public Genre updateGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    public void deleteAllGenres() {
        genreRepository.deleteAll();
    }


}
