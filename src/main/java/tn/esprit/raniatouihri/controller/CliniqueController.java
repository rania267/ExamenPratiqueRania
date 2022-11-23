package tn.esprit.raniatouihri.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.raniatouihri.entities.Clinique;
import tn.esprit.raniatouihri.repository.CliniqueRepository;
import tn.esprit.raniatouihri.services.ICliniqueService;

@RestController
@AllArgsConstructor
public class CliniqueController {
    ICliniqueService iCliniqueService;
    CliniqueRepository cliniqueRepository;
    @PostMapping("/addClinique")
    @ResponseBody
    public Clinique addClinique(@RequestBody Clinique clinique){
        return iCliniqueService.addClinique(clinique);
    }
}
