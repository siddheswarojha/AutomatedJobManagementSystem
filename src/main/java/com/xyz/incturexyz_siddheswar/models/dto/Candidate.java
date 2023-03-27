package com.xyz.incturexyz_siddheswar.models.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.Multipart;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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

