package esprit.tn.Controller;

import esprit.tn.Entity.Contrat;
import esprit.tn.Service.IContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/ContratC")
public class ContratController {


    @Autowired
    IContratService contratService;
    @GetMapping("/")
    public String hello() {return "hello world";}
    @PostMapping("/addContrat")
    @ResponseBody
    public void addContrat(@RequestBody Contrat contrat)
    {
        contratService.ajouter_contrat(contrat);
    }
    @PostMapping("/updateContrat")
    @ResponseBody
    public void updateContrat(@RequestBody Contrat Contrat)
    {
        contratService.update_contrat(Contrat);
    }
    @PostMapping("/deleteContrat")
    @ResponseBody
    public void deleteContrat(@RequestBody Contrat Contrat)
    {
        contratService.delete_contrat(Contrat.getIdContrat());
    }
    @PostMapping("/AllContrats")
    @ResponseBody
    public void AllContrats()
    { contratService.contrat_List();
    }
}