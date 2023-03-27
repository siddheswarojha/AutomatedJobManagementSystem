package com.xyz.incturexyz_siddheswar.models.dto;


import com.xyz.incturexyz_siddheswar.services.CandidateService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Interview extends AbstractPersistable<Long> {
    private String interviewName;
    private String interviewDetails;
    private String interviewDate;

    @ManyToMany
    List<Candidate> candidate;

}
