package com.nc.springboot.controller;

import com.nc.springboot.model.Genre;
import com.nc.springboot.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@RequestMapping("/")

@Controller
public class GenreViewController {

    @Autowired
    private GenreService genreService;
@GetMapping("/genres")
    public String getGenre(Model model) {
        List<Genre> genres = genreService.getAllGenres();
        model.addAttribute("genres", genres);
        return "genres";
    }

    @GetMapping("/genres/add")
    public String showAddGenreForm(Model model) {
        model.addAttribute("genre", new Genre());
        return "add-genre";
    }
}
