package com.AH.BreizhVideoBack.service;

import com.AH.BreizhVideoBack.model.Representation;


import java.util.List;
import java.util.Optional;


public interface RepresentationService {
    Optional<Representation> findById(Long id);
    List<Representation> findAll(String search);
    Representation insert(Representation representation);
    Representation update(Long id, Representation representation);
    void delete(Long id);
}
