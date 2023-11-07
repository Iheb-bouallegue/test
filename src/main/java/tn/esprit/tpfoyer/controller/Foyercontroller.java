package tn.esprit.tpfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.services.IFoyerService;

import java.util.List;

@RestController
@RequestMapping("/foyer")
public class Foyercontroller {
    @Autowired
    IFoyerService FoyerService;

    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        return FoyerService.addFoyer(
                f);
    }

    @GetMapping("/retrieveAllFoyers")
    public List<Foyer> getFoyer() {
        return FoyerService.retrieveAllFoyers();
    }

    @DeleteMapping("/DeleteFoyer/{numFoyer}")
    public void SupprimerFoyer(@PathVariable("numFoyer") long numFoyer) {
        FoyerService.removeFoyer(numFoyer);
    }
}
