package com.pedrodecf.vagas_on.modules.candidate.controllers;

import com.pedrodecf.vagas_on.modules.candidate.CandidateEntity;
import com.pedrodecf.vagas_on.modules.candidate.CandidateRepositoy;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateRepositoy candidateRepositoy;

    @PostMapping("/")
    public CandidateEntity create(@Valid @RequestBody CandidateEntity candidateEntity) {
        return this.candidateRepositoy.save(candidateEntity);
    }
}
