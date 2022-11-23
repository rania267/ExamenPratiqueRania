package tn.esprit.raniatouihri.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.raniatouihri.entities.Clinique;
import tn.esprit.raniatouihri.entities.Patient;
import tn.esprit.raniatouihri.repository.CliniqueRepository;
import tn.esprit.raniatouihri.repository.PatientRepository;
import tn.esprit.raniatouihri.services.ICliniqueService;
import tn.esprit.raniatouihri.services.IPatientService;

@RestController
@AllArgsConstructor
public class PatientController {
    PatientRepository patientRepository;
    IPatientService iPatientService;
    CliniqueRepository
    @PostMapping("/addPatient")
    @ResponseBody
    public Clinique addPatient(@RequestBody Patient patient){
        return iPatientService.addPatient(Patient);
    }
}
