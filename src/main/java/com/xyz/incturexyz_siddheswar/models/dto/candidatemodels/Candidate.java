package com.xyz.incturexyz_siddheswar.models.dto.candidatemodels;

import com.xyz.incturexyz_siddheswar.models.dto.interviewmodels.Interview;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Candidate extends AbstractPersistable<Long> {

    private String candidateName;
    private String candidateEmail;
    private String filePath;

    @ManyToMany
    List<Interview> interview;



}

