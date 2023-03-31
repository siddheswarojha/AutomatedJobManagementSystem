package com.xyz.incturexyz_siddheswar.services;

import com.xyz.incturexyz_siddheswar.models.dto.interviewmodels.Interview;
import com.xyz.incturexyz_siddheswar.models.dto.interviewmodels.InterviewAddRequest;
import com.xyz.incturexyz_siddheswar.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewServiceImplementation implements InterviewService {

    @Autowired
    private InterviewRepository interviewRepository;
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


}
