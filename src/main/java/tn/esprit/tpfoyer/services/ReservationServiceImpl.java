package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.repository.IReservationRepository;

import java.util.List;
@Service
public class ReservationServiceImpl implements IReservationService {
    @Autowired
    IReservationRepository reservationRepository;
    @Override
    public List<Reservation> retrieveallreser() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation retrievereser(String idReservation) {
        return reservationRepository.findById(idReservation).get();
    }

    @Override
    public Reservation addReser(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public void removereser(String idReservation) {
reservationRepository.deleteById(idReservation);
    }

    @Override
    public Reservation modifyreser(Reservation r) {
        return reservationRepository.save(r);
    }
}
