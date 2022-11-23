package tn.esprit.raniatouihri.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table( name = "Clinique")

public class Clinique implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idClinique;
     private String nomClinique;
    private String adresse;
    private int telephone;


    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Medecin> medecins;

}
