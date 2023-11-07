package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.repository.IEtudiantRepository;

import java.util.List;
@Service

public class EtudiantServiceImpl implements IEtudiantService {
   @Autowired
    IEtudiantRepository iEtudiantRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return iEtudiantRepository.findAll();
    }


    @Override
    public Etudiant retrieveEtudiants(int EtudiantId) {
        return iEtudiantRepository.findById(EtudiantId).get();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return iEtudiantRepository.save(e);
    }

    @Override
    public void removeEtudiant(int EtudiantId) {
      iEtudiantRepository.deleteById(EtudiantId);
    }

    @Override
    public Etudiant modifyEtudiant(Etudiant etudiant) {
        return iEtudiantRepository.save(etudiant);
    }
}
