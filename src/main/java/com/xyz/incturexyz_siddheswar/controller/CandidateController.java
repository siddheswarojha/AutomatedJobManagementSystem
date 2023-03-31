package com.xyz.incturexyz_siddheswar.controller;

import com.xyz.incturexyz_siddheswar.models.dto.candidatemodels.Candidate;
import com.xyz.incturexyz_siddheswar.models.dto.candidatemodels.CandidateRequest;
import com.xyz.incturexyz_siddheswar.models.dto.interviewmodels.Interview;
import com.xyz.incturexyz_siddheswar.services.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
    public Candidate addCandidate(@RequestBody CandidateRequest candidateRequest) {
        return candidateService.addCandidate(candidateRequest);
    }

    @PostMapping("/applyJob")
    public String applyJob(@RequestBody Candidate candidate,
                           @RequestBody Interview interview){
        return candidateService.applyJob(candidate,interview);
    }

    @PostMapping("/uploadResume")
    public String uploadResume(@RequestPart("resume") MultipartFile file){
        return candidateService.uploadResume(file);
    }






}
