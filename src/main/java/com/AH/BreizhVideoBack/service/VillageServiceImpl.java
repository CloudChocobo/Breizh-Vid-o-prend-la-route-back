package com.AH.BreizhVideoBack.service;

import com.AH.BreizhVideoBack.model.Village;
import com.AH.BreizhVideoBack.repository.VillageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VillageServiceImpl implements VillageService {

    @Autowired
    private VillageRepository repository;


    @Override //recherche tout
    public List<Village> findAll(String search) {
        if (! "".equals(search))
            return repository.findByNomContaining(search);
        else
            return repository.findAll();

    }
    @Override //recherche par ID
    public Optional<Village> findById(Long id) {
        return repository.findById(id);
    }

    @Override //création village
    public Village insert(Village village) {
        return repository.save(village);
    }

    @Override //MAJ village
    public Village update(Long id, Village village) {
        Optional<Village> optionalVillage = this.findById(id);
        if(optionalVillage.isPresent()) {
            Village villageToUpdate = optionalVillage.get();
            villageToUpdate.setNom(village.getNom());
            if (village.getCodePostal() != null) 
            villageToUpdate.setCodePostal(village.getCodePostal());
            return repository.save(villageToUpdate);
        }
        return null;
    }

    @Override //suppression village
    public void delete(Long id) {
        Optional<Village> village = this.findById(id);
        if (village.isPresent()) {
            repository.delete(village.get());
        }
    }

}