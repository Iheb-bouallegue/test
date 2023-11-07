package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.repository.IFoyerRepository;

import java.util.List;
@Service
public class FoyerServiceImpl implements IFoyerService{
    @Autowired
    IFoyerRepository iFoyerRepository;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return iFoyerRepository.findAll();
    }

    @Override
    public Foyer retrieveFoyer(long FoyerId) {
        return iFoyerRepository.findById(FoyerId).get();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return iFoyerRepository.save(f);
    }

    @Override
    public void removeFoyer(long FoyerId) {
        iFoyerRepository.deleteById(FoyerId);

    }

    @Override
    public Foyer modifyFoyer(Foyer foyer) {
        return iFoyerRepository.save(foyer);
    }
}
