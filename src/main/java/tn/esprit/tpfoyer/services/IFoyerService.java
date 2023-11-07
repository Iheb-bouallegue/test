package tn.esprit.tpfoyer.services;


import tn.esprit.tpfoyer.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    public List<Foyer> retrieveAllFoyers();
    public Foyer retrieveFoyer(long FoyerId);
    public Foyer addFoyer(Foyer f);
    public void removeFoyer(long FoyerId);
    public Foyer modifyFoyer(Foyer foyer);
}
