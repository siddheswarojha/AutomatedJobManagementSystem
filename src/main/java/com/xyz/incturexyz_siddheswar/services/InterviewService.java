package com.xyz.incturexyz_siddheswar.services;

import com.xyz.incturexyz_siddheswar.models.dto.interviewmodels.Interview;
import com.xyz.incturexyz_siddheswar.models.dto.interviewmodels.InterviewAddRequest;

import java.util.List;

public interface InterviewService {
    List<Interview> getAllInterview();

    Interview addInterview(InterviewAddRequest interview);

    String displayResult(Long candidateId, Long interviewId);
}
