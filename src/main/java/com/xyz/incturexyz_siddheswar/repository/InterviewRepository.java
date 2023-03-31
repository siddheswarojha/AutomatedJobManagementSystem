package com.xyz.incturexyz_siddheswar.repository;

import com.xyz.incturexyz_siddheswar.models.dto.interviewmodels.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InterviewRepository extends JpaRepository<Interview,Long> {
    List<Interview> findAllByCandidateId(long candidateId);
}
