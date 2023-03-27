package com.xyz.incturexyz_siddheswar.services;


import com.xyz.incturexyz_siddheswar.models.dto.Candidate;
import com.xyz.incturexyz_siddheswar.models.dto.Interview;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CandidateService {
     String applyJob(Candidate candidate, Interview interview);

     List<Candidate> getCandidates();

    Candidate addCandidate(Candidate candidate);
}
