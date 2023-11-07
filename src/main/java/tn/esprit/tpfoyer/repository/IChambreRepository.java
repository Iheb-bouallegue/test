package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Chambre;

import java.util.List;

@Repository
public interface IChambreRepository extends JpaRepository<Chambre,Long> {
    public List<Chambre> findByReservationsNull();


}
