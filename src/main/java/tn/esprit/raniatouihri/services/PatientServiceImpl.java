package tn.esprit.raniatouihri.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.raniatouihri.entities.Clinique;
import tn.esprit.raniatouihri.entities.Patient;
import tn.esprit.raniatouihri.repository.MedecinRepository;
import tn.esprit.raniatouihri.repository.PatientRepository;

@Service
@AllArgsConstructor
public class PatientServiceImpl implements IPatientService{
    PatientRepository patientRepository;
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }
}
