package tn.esprit.raniatouihri.services;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import tn.esprit.raniatouihri.entities.Medecin;

import java.util.Date;

public interface IMedecinService {
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long cliniqueId);
    public int getRevenuMedecin(@PathVariable("idMedecin") Long idMedecin, @PathVariable("startDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date startDate,
            ,
                                @PathVariable("endDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate){

    }

}
