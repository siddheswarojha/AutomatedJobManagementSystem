package com.xyz.incturexyz_siddheswar.services;

import com.xyz.incturexyz_siddheswar.models.dto.candidatemodels.Candidate;
import com.xyz.incturexyz_siddheswar.models.dto.interviewmodels.Interview;
import com.xyz.incturexyz_siddheswar.models.dto.interviewmodels.InterviewAddRequest;
import com.xyz.incturexyz_siddheswar.repository.CandidateRepository;
import com.xyz.incturexyz_siddheswar.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InterviewServiceImplementation implements InterviewService {

    @Autowired
    private InterviewRepository interviewRepository;
    @Autowired
    private CandidateRepository candidateRepository;
    @Override
    public List<Interview> getAllInterview()
    {
        return interviewRepository.findAll();
    }

    @Override
    public Interview addInterview(InterviewAddRequest interview) {
        Interview newInterview = new Interview();
        newInterview.setInterviewName(interview.getInterviewName());
        newInterview.setInterviewDetails(interview.getInterviewDetails());
        newInterview.setInterviewDate(interview.getInterviewDate());
        interviewRepository.save(newInterview);
        return newInterview;

    }

    @Override
    public String displayResult(Long candidateId, Long interviewId) {
       List<Candidate> listOfCandidate = candidateRepository.findAllByInterviewId(interviewId);
       for(int i =0;i< listOfCandidate.size();i++){
           if(listOfCandidate.get(i).getId().equals(candidateId)){
               Optional<Interview> interview = interviewRepository.findById(interviewId);
               if(interview.isPresent()){
                   interview.get().setInterviewResult(true);
                   interviewRepository.save(interview.get());
                   return "success";
               }
           }
       }
       return "failed";






    }


}
