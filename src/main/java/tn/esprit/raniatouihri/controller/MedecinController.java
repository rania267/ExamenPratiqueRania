package tn.esprit.raniatouihri.controller;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.raniatouihri.entities.Medecin;
import tn.esprit.raniatouihri.services.ICliniqueService;
import tn.esprit.raniatouihri.services.IMedecinService;

import java.util.Date;

@RestController
@AllArgsConstructor
public class MedecinController {
    IMedecinService iMedecinService;
    @PutMapping("/addMedecinAndAssignToClinique/{medecinId}/{cliniqueId}")
    public void addMedecinAndAssignToClinique(@PathVariable("medecinId") long medecinId, @PathVariable("cliniqueId") long cliniqueId){

        iMedecinService.addMedecinAndAssignToClinique(medecintId,cliniqueId);
    }
    @GetMapping("/getRevenuMedecin")
    public int getRevenuMedecin(@PathVariable("idMedecin") Long idMedecin, @PathVariable("startDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date startDate,
            ,@PathVariable("endDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate){

    }
}
