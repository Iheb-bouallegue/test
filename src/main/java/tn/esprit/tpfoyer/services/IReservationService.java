package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Reservation;

import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveallreser();
    public Reservation  retrievereser (String idReservation);
    public Reservation addReser (Reservation r);
    public void removereser (String idReservation);
    public Reservation modifyreser (Reservation r);
}
