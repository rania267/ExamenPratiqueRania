package tn.esprit.raniatouihri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.raniatouihri.entities.Clinique;
import tn.esprit.raniatouihri.entities.Medecin;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
}
