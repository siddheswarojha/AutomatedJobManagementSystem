package com.xyz.incturexyz_siddheswar.services;


import com.xyz.incturexyz_siddheswar.models.dto.candidatemodels.Candidate;
import com.xyz.incturexyz_siddheswar.models.dto.candidatemodels.CandidateRequest;
import com.xyz.incturexyz_siddheswar.models.dto.interviewmodels.Interview;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface CandidateService {
     String applyJob(Candidate candidate, Interview interview);

     List<Candidate> getCandidates();

    Candidate addCandidate(CandidateRequest candidate);

    String uploadResume(MultipartFile file);
}
