package com.AH.BreizhVideoBack.controller;

import com.AH.BreizhVideoBack.model.Village;
import com.AH.BreizhVideoBack.service.VillageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")

public class VillageController {
    @Autowired
    VillageService villageService;


    @GetMapping("/villages")
    public List<Village> getAllVillage() {
        return villageService.listVillages("");
    }
    public ResponseEntity<List<Village>> getVillages(@RequestParam(value="search", defaultValue="") String search) {
       List<Village> listVillage;
        try {
        listVillage = villageService.listVillages(search);
        } catch (Exception e) {
        return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(listVillage);    
    }

    @GetMapping("/villages/{id}")
    ResponseEntity<Village> getVillageById(@PathVariable(value="id") long id) {
        Optional<Village> village = villageService.getVillage(id);
        if (village.isEmpty()) {
        return ResponseEntity.notFound().build();
        }    
        return ResponseEntity.ok().body(village.get());
    }

    @PostMapping("/villages")    
    ResponseEntity<Village> addVillage(@RequestBody Village village){
        return ResponseEntity.ok().body(villageService.insertVillage(village));
    }

    @PutMapping("/villages/{id}")
    ResponseEntity<Village> updateVillage(@PathVariable(value="id") long id, @RequestBody Village village){
        Village updatedVillage = villageService.updateVillage(id, village);
        if(updatedVillage == null)
        return ResponseEntity.notFound().build();
        return ResponseEntity.ok().body(updatedVillage);
        }

    @DeleteMapping("/villages/{id}")
    ResponseEntity<Village> deleteVillage(@PathVariable(value="id") long id){
        Optional<Village> village = villageService.getVillage(id);
        if(village.isEmpty())
        return ResponseEntity.notFound().build();
        villageService.deleteVillage(village.get().getId());
        return ResponseEntity.accepted().build();
    }  
    
    
}