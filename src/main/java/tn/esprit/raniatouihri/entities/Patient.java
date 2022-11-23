package tn.esprit.raniatouihri.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table( name = "Patient")
public class Patient implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPatient;
    private String nomPatient;
    private int telephone;
    private Date dateNaissace;

    @JsonIgnore
    @OneToMany(mappedBy = "patient",cascade = CascadeType.ALL)
    private Set<RendezVous> rendezVous;

}
