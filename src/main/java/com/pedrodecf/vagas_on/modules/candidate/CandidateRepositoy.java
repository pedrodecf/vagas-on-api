package com.pedrodecf.vagas_on.modules.candidate;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CandidateRepositoy extends JpaRepository<CandidateEntity, UUID> {
}
