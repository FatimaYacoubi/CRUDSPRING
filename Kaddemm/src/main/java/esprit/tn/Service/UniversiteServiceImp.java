package esprit.tn.Service;

import esprit.tn.Entity.Universite;
import esprit.tn.Repository.UniversiteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class UniversiteServiceImp implements IUniversiteService{
    @Autowired
    UniversiteRepository UniversiteRepository;
    public Integer ajouter_Universite(Universite e)
    {
        UniversiteRepository.save(e);
        log.info("ajouter Universiter");
        return (1);
    }
    public String delete_Universite(Integer id) {
        UniversiteRepository.deleteById(id);
        log.info("deleted ");
        return "DEleted";
    }

    public List<Universite> Universite_List() {
        return UniversiteRepository.findAll();

    }

    public void update_Universite(Universite e) {
        UniversiteRepository.save(e);

    }

    public String deleteAllE() {
        UniversiteRepository.deleteAll();
        return "deleted";
    }
    public void assignUniversiteToDepartement(Integer idUniversite, Integer
            idDepartement)
    {
        Universite Universitee = UniversiteRepository.findById(idUniversite).get();
        Departement Departementd = departementRepository.findById(Departement).get();
        Universitee.setDepartement(Universitee);
        departementRepository.save(Departementd);
    }

}

