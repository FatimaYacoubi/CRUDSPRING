package esprit.tn.Service;

import esprit.tn.Entity.Departement;
import esprit.tn.Repository.DepartementRepository;
import esprit.tn.Entity.Etudiant;
import esprit.tn.Repository.EtudiantRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class DepartementServiceImp implements IDepartementService{
    @Autowired
    DepartementRepository departementRepository;
    @Autowired
    EtudiantRepository etudiantRepository;
    public Integer ajouter_departement(Departement e)
    {
        departementRepository.save(e);
        log.info("ajouter departementr");
        return (1);
    }
    public String delete_departement(Integer id) {
        departementRepository.deleteById(id);
        log.info("deleted ");
        return "DEleted";
    }

    public List<Departement> departement_List() {
        return departementRepository.findAll();

    }

    public void update_departement(Departement e) {
        departementRepository.save(e);

    }

    public String deleteAllE() {
        departementRepository.deleteAll();
        return "deleted";
    }
    public void assignEtudiantToDepartement (Long etudiantId, Integer
            departementId) {
        Etudiant Etudiante = etudiantRepository.findById(idEtudiant).get();
        Departement Departementd = departementRepository.findById(Departement).get();
        Etudiant.setDepartement(Etudiante);
        departementRepository.save(Departementd);
    }
}
