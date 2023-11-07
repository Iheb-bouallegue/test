package tn.esprit.tpfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.tpfoyer.entities.Etudiant;

import tn.esprit.tpfoyer.services.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {
    @Autowired
    IEtudiantService etudiantService;

    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e){
        return etudiantService.addEtudiant(
                e);
    }
    @GetMapping("/retrieveAllEtudiants")
    public List<Etudiant> getEtudiants()
    {
        return etudiantService.retrieveAllEtudiants();
    }
    @DeleteMapping("/DeleteEtudiant/{numEtud}")
    public void SupprimerEtudiant(@PathVariable("numEtud") int numEtud){
        etudiantService.removeEtudiant(numEtud);
    }
}

