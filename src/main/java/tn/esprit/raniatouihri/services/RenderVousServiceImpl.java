package tn.esprit.raniatouihri.services;

import tn.esprit.raniatouihri.entities.Medecin;
import tn.esprit.raniatouihri.entities.Patient;
import tn.esprit.raniatouihri.entities.RendezVous;
import tn.esprit.raniatouihri.entities.Specialite;
import tn.esprit.raniatouihri.repository.MedecinRepository;
import tn.esprit.raniatouihri.repository.PatientRepository;
import tn.esprit.raniatouihri.repository.RendezVousRepository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class RenderVousServiceImpl implements IRendezVousService{
    PatientRepository patientRepository;
    RendezVousRepository rendezVousRepository;
    MedecinRepository medecinRepository;
    @Override
    @Transactional
    public void addRDVAndAssignMedAndPatient(RendezVous rdv, Long idMedecin, Long idPatient) {
        Medecin medecin = medecinRepository.findById(idMedecin).orElse(null);
        Patient patient = patientRepository.findById(idPatient).orElse(null);
        patient.setRendezVous((Set<RendezVous>) rdv);
        medecin.getRendezVous().add(rdv);

    }
    @Override
    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite) {
        return rendezVousRepository.findByCliniqueAndSpecialite(idClinique,specialite);
    }
    @Override
    public Integer nbRendezVousMedecin(Long idMedecin) {
        Integer i = 0;
        List<RendezVous> listRendezVous = rendezVousRepository.findAll();
        for (RendezVous r: listRendezVous) {

                i++;

        }
        return i;
    }
}
