package tn.esprit.raniatouihri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.raniatouihri.entities.Patient;
import tn.esprit.raniatouihri.entities.RendezVous;
import tn.esprit.raniatouihri.entities.Specialite;

import java.util.List;

public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {
    List<RendezVous> findByCliniqueAndSpecialite(Long idClinique, Specialite specialite);
}
