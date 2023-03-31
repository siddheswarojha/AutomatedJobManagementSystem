package com.xyz.incturexyz_siddheswar.services;

import com.xyz.incturexyz_siddheswar.helper.ResumeUploadHelper;
import com.xyz.incturexyz_siddheswar.models.dto.candidatemodels.Candidate;
import com.xyz.incturexyz_siddheswar.models.dto.candidatemodels.CandidateRequest;
import com.xyz.incturexyz_siddheswar.models.dto.interviewmodels.Interview;
import com.xyz.incturexyz_siddheswar.repository.CandidateRepository;
import com.xyz.incturexyz_siddheswar.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class CandidateServicesImplementation implements CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private InterviewRepository interviewRepository;

    @Override
    public String applyJob(Candidate candidate, Interview interview) {
        if(candidateRepository.findById(candidate.getId()).equals(interviewRepository.findById(interview.getId()))){
            return "already applied";
        }else{
            Candidate cd = candidateRepository.findById(candidate.getId()).get();
            Interview iv = interviewRepository.findById(interview.getId()).get();
            List<Interview> ivNew = interviewRepository.findAllByCandidateId(candidate.getId());
            ivNew.add(iv);
            cd.setInterview(ivNew);
            List<Candidate> cdNew = candidateRepository.findAllByInterviewId(interview.getId());
            cdNew.add(cd);
            candidateRepository.save(cd);
            interviewRepository.save(iv);
            return "successfully posted";
        }
    }

    @Override
    public List<Candidate> getCandidates() {
        return candidateRepository.findAll();
    }

    @Override
    public Candidate addCandidate(CandidateRequest candidate) {
        Candidate newCandidate = new Candidate();
        newCandidate.setCandidateName(candidate.getCandidateName());
        newCandidate.setCandidateEmail(candidate.getCandidateEmail());
        candidateRepository.save(newCandidate);
        return newCandidate;

    }

    @Override
    public String uploadResume(MultipartFile file) {
        if(file.isEmpty()){
            return "empty file";
        }else{
            ResumeUploadHelper helper = new ResumeUploadHelper();
           boolean b = helper.fileUpload(file);
           if(b)
           {
               return "successfully uploaded";
           }else{
               return "failed";
           }

        }
    }
}
