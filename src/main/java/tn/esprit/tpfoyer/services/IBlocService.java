package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Bloc;


import java.util.List;

public interface IBlocService {
    public List<Bloc> retrieveAllBlocs();
    public Bloc retrieveBloc(Long BlocId);
    public Bloc addBloc(Bloc b);
    public void removeBloc(Long BlocId);
    public Bloc modifyBloc(Bloc bloc);
}
