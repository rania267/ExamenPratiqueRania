package tn.esprit.raniatouihri.services;

import tn.esprit.raniatouihri.entities.RendezVous;
import tn.esprit.raniatouihri.entities.Specialite;

import java.util.List;

public interface IRendezVousService {
    public void addRDVAndAssignMedAndPatient(RendezVous rdv, Long idMedecin, Long idPatient);
    public Integer nbRendezVousMedecin(Long idMedecin);
    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite);
}
