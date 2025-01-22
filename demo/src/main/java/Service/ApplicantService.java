package Service;

import Entity.Applicant;
import Repositories.ApplicantCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicantService {

    @Autowired
    private ApplicantCRUDRepository applicantCRUDRepository ;


    public List<Applicant> getAllApplication(){
        Iterable<Applicant> all = applicantCRUDRepository.findAll() ;
        List<Applicant> applicantList = new ArrayList<>() ;
        all.forEach(applicantList::add);
        return applicantList ;
    }


   public Applicant saveApplication(Applicant applicant) {
        return  applicantCRUDRepository.save(applicant) ;

   }

}
