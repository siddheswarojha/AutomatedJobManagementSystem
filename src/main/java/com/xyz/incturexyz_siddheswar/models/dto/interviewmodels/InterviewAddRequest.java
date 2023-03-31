package com.xyz.incturexyz_siddheswar.models.dto.interviewmodels;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InterviewAddRequest {
    private String interviewName;
    private String interviewDetails;
    private String interviewDate;
}
