package com.nc.springboot.repository;

import com.nc.springboot.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
  }