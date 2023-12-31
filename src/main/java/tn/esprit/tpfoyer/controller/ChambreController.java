package tn.esprit.tpfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambre")

public class ChambreController {
    @Autowired
    IChambreService chambreService;

    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre c){
        return chambreService.addChambre(c);
    }
    @GetMapping("/retrieveAllChambres")
    public List<Chambre>getChambres()
    {
        return chambreService.retrieveAllChambres();
    }
    @DeleteMapping("/DeleteChambre/{numC}")
    public void SupprimerChambre(@PathVariable("numC") Long numC){
         chambreService.removeChambre(numC);
    }





















}
