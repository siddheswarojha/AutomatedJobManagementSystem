package com.xyz.incturexyz_siddheswar.repository;

import com.xyz.incturexyz_siddheswar.models.dto.candidatemodels.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CandidateRepository extends JpaRepository<Candidate,Long> {
    List<Candidate> findAllByInterviewId(long interviewId);

}
