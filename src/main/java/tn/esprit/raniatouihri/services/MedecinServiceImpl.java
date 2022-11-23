package tn.esprit.raniatouihri.services;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import tn.esprit.raniatouihri.entities.Clinique;
import tn.esprit.raniatouihri.entities.Medecin;
import tn.esprit.raniatouihri.repository.CliniqueRepository;
import tn.esprit.raniatouihri.repository.MedecinRepository;

import java.util.Date;

@Service
@AllArgsConstructor
public class MedecinServiceImpl implements IMedecinService{
    MedecinRepository medecinRepository;
    CliniqueRepository cliniqueRepository;
    @Override
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long cliniqueId) {
        Medecin medecin = medecinRepository.findById(medecinId).orElse(null);
        Clinique clinique = cliniqueRepository.findById(cliniqueId).orElse(null);
        medecin.setClinique(clinique);
        medecinRepository.save(medecin);
    }
    @Override
    public int getRevenuMedecin(@PathVariable("idMedecin") Long idMedecin, @PathVariable("startDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date startDate,
            ,
                                @PathVariable("endDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate){
        

    }

}
