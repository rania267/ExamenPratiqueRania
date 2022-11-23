package tn.esprit.raniatouihri.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.raniatouihri.entities.Clinique;
import tn.esprit.raniatouihri.repository.CliniqueRepository;

@Service
@AllArgsConstructor
public class CliniqueServiceImpl implements ICliniqueService{
    CliniqueRepository cliniqueRepository;
    @Override
    public Clinique addClinique(Clinique clinique) {
        return cliniqueRepository.save(clinique);
    }
}
