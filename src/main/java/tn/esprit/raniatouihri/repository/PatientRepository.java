package tn.esprit.raniatouihri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.raniatouihri.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
