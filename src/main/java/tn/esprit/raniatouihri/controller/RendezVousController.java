package tn.esprit.raniatouihri.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.raniatouihri.entities.RendezVous;
import tn.esprit.raniatouihri.entities.Specialite;
import tn.esprit.raniatouihri.services.IPatientService;
import tn.esprit.raniatouihri.services.IRendezVousService;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
public class RendezVousController {
    IRendezVousService iRendezVousService;

    @GetMapping("/getNbrRendezVousMedecin")
    public Integer nbRendezVousMedecin(@RequestParam Long idMedecin) {
        return iRendezVousService.nbRendezVousMedecin(idMedecin);
    }

    @PostMapping("addRDVAndAssignMedAndPatient/{idMedecin}/{idPatient}")
    @ResponseBody
    public void addRDVAndAssignMedAndPatient(RendezVous rdv, Long idMedecin, Long idPatient) {
        return iRendezVousService.addRDVAndAssignMedAndPatient(rdv, idMedecin, idPatient);
    }

    @GetMapping("/getRendezVousByCliniqueAndSpecialite")
    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite) {
        return iRendezVousService.getRendezVousByCliniqueAndSpecialite(idClinique,specialite);

    }

}



