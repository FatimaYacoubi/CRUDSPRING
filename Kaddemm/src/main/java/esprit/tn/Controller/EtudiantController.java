package esprit.tn.Controller;

import esprit.tn.Entity.Etudiant;
import esprit.tn.Service.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/EtudiantC")
public class EtudiantController {
    @Autowired
IEtudiantService etudiantService;
@GetMapping("/")
    public String hello() {return "hello world";}
    @PostMapping("/addEtudiant")
    @ResponseBody
    public void addEtudiant(@RequestBody Etudiant etudiant)
    {
        etudiantService.ajouter_etudiant(etudiant);
    }
    @PostMapping("/updateEtudiant")
    @ResponseBody
    public void updateEtudiant(@RequestBody Etudiant etudiant)
    {
        etudiantService.update_Etudiant(etudiant);
    }
    @PostMapping("/deleteEtudiant")
    @ResponseBody
    public void deleteEtudiant(@RequestBody Etudiant etudiant)
    {
        etudiantService.delete_etudiant(etudiant.getIdEtudiant());
    }
    @PostMapping("/AllEtudiants")
    @ResponseBody
    public void AllEtudiants()
    { etudiantService.etudiant_List();
    }
}
