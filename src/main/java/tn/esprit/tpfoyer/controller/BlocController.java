package tn.esprit.tpfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.services.IBlocService;


import java.util.List;
@RestController
@RequestMapping("/bloc")
public class BlocController {

        @Autowired
        IBlocService blocService;

        @PostMapping("/addBloc")
        public Bloc addBloc(@RequestBody Bloc b){
            return blocService.addBloc(
                    b);
        }
        @GetMapping("/retrieveAllBlocs")
        public List<Bloc> getBlocs()
        {
            return blocService.retrieveAllBlocs();
        }
       @DeleteMapping("/DeleteChambre/{nomBloc}")
       public void SupprimerBloc(@PathVariable("nomBloc") Long nomBloc){
           blocService.removeBloc(nomBloc);
       }
}
