package com.AH.BreizhVideoBack.controller;

import com.AH.BreizhVideoBack.model.Village;
import com.AH.BreizhVideoBack.service.VillageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;
import java.util.Optional;

@RestController


public class VillageController {
    @Autowired
    VillageService service;

    @CrossOrigin
    @GetMapping("/villages")
   //récupérer les données et les lire (tous les villages)
    public ResponseEntity<List<Village>> getAllVillages(@RequestParam(value="search", defaultValue="") String search) {
       List<Village> listVillage;
        try {
        listVillage = service.findAll(search);
        } catch (Exception e) {
        return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(listVillage);    
    }

    @CrossOrigin
    @GetMapping("/villages/{id}") //récupérer les données et les lire par ID
    ResponseEntity<Village> getVillageById(@PathVariable(value="id") long id) {
        Optional<Village> village = service.findById(id);
        if (village.isEmpty()) {
        return ResponseEntity.notFound().build();
        }    
        return ResponseEntity.ok().body(village.get());
    }

    @CrossOrigin
    @PostMapping("/villages")    //ajouter un village
    ResponseEntity<Village> addVillage(@RequestBody Village village){
        return ResponseEntity.ok().body(service.insert(village));
    }

    @CrossOrigin
    @PutMapping("/villages/{id}") //mettre à jour un village
    ResponseEntity<Village> updateVillage(@PathVariable(value="id") long id, @RequestBody Village village){
        Village updatedVillage = service.update(id, village);
        if(updatedVillage == null)
        return ResponseEntity.notFound().build();
        return ResponseEntity.ok().body(updatedVillage);
        }
        
    @CrossOrigin
    @DeleteMapping("/villages/{id}") // supprimer un village
    ResponseEntity<Village> deleteVillage(@PathVariable(value="id") long id){
        Optional<Village> village = service.findById(id);
        if(village.isEmpty())
        return ResponseEntity.notFound().build();
        service.delete(village.get().getId());
        return ResponseEntity.accepted().build();
    }  
}