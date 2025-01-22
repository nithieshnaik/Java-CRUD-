package Controllers;

import Entity.Applicant;
import Service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApplicationController {


    @Autowired
    private ApplicantService applicantService;

    @GetMapping
    public List<Applicant> getAllApplication(){

        return applicantService.getAllApplication() ;
    }

    @PostMapping
    public Applicant saveApplicant(@RequestBody Applicant applicant){
        return applicantService.saveApplication(applicant) ;
    }




}
