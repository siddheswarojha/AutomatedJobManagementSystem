package com.xyz.incturexyz_siddheswar.services;

import com.xyz.incturexyz_siddheswar.models.dto.Interview;

import java.util.List;

public interface InterviewService {
    List<Interview> getAllInterview();

    Interview addInterview(Interview interview);
}
