package com.xyz.incturexyz_siddheswar.controller;

import com.xyz.incturexyz_siddheswar.models.dto.Candidate;
import com.xyz.incturexyz_siddheswar.models.dto.Interview;
import com.xyz.incturexyz_siddheswar.services.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("InctureXYZ/api/v1/")
public class CandidateController {
    @Autowired
    private CandidateService candidateService;


    @GetMapping("/candidate")
    public List<Candidate> getCandidates(){
        return this.candidateService.getCandidates();
    }

    @PostMapping("/candidate")
    public Candidate addCandidate(@RequestBody Candidate candidate) {
        return this.candidateService.addCandidate(candidate);
    }

    @PostMapping("/applyJob")
    public String applyJob(@RequestBody Candidate candidate,
                           @RequestBody Interview interview){
        return candidateService.applyJob(candidate,interview);
    }

}
