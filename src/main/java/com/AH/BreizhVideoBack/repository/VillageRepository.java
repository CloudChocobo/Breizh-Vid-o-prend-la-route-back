package com.AH.BreizhVideoBack.repository;

import com.AH.BreizhVideoBack.model.Village;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VillageRepository extends JpaRepository<Village, Long> {
    public List<Village> findByNameContaining(String nom);
}