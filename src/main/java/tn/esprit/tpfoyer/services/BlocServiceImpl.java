package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.repository.IBlocRepository;


import java.util.List;

@Service
public class BlocServiceImpl implements IBlocService {
    @Autowired
    IBlocRepository iBlocRepository;

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return iBlocRepository.findAll();
    }

    @Override
    public Bloc retrieveBloc(Long BlocId) {
        return iBlocRepository.findById(BlocId).get();
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return iBlocRepository.save(b);
    }

    @Override
    public void removeBloc(Long BlocId) {
      iBlocRepository.deleteById(BlocId);
    }

    @Override
    public Bloc modifyBloc(Bloc bloc) {
        return iBlocRepository.save(bloc);
    }
}
