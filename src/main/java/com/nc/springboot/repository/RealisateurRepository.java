package com.nc.springboot.repository;

import com.nc.springboot.model.Realisteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealisateurRepository extends JpaRepository<Realisteur, Long> {
}