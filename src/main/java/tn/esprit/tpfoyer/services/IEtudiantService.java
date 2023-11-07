package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public List<Etudiant> retrieveAllEtudiants();
    public Etudiant retrieveEtudiants(int EtudiantId);
    public Etudiant addEtudiant(Etudiant e);
    public void removeEtudiant(int EtudiantId);
    public Etudiant modifyEtudiant(Etudiant etudiant);
}

