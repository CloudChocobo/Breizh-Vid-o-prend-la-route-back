package com.AH.BreizhVideoBack.repository;

import java.util.List;

import com.AH.BreizhVideoBack.model.Village;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface FilmRepository extends JpaRepository<Film, Long> {

}