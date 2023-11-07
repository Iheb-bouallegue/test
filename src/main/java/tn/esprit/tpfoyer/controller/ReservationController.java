package tn.esprit.tpfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.services.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    @Autowired
    IReservationService reservationService;
    @PostMapping("/addreser")
    public Reservation addBloc(@RequestBody Reservation r){
        return reservationService.addReser(r);
    }
    @GetMapping("/retrieveAllreser")
    public List<Reservation> getreser()
    {
        return reservationService.retrieveallreser();
    }
    @DeleteMapping("/Deletereser/{numreser}")
    public void Supprimerreser(@PathVariable("numreser")String numreser ){
        reservationService.removereser(numreser);
    }
}


