package com.xyz.incturexyz_siddheswar.controller;

import com.xyz.incturexyz_siddheswar.models.dto.interviewmodels.Interview;
import com.xyz.incturexyz_siddheswar.models.dto.interviewmodels.InterviewAddRequest;
import com.xyz.incturexyz_siddheswar.services.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class InterviewController {

    @Autowired
    private InterviewService interviewService;

    @GetMapping("getInterview/")
    public List<Interview> getAllInterview(){
        return interviewService.getAllInterview();
    }

    @PostMapping("addInterview/")
    public Interview addInterview(@RequestBody InterviewAddRequest interview){
        return interviewService.addInterview(interview);
    }
}
