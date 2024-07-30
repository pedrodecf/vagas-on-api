package com.pedrodecf.vagas_on.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEntity {

    private UUID id;
    private String name;

    @Pattern(regexp = "\\S+", message = "Username should contain only letters and numbers")
    private String username;

    @Email(message = "Email should be valid and contain '@' and '.'")
    private String email;

    @Length(min = 6, message = "Password should have at least 6 characters", max = 100)
    private String password;

    private String description;
    private String curriculum;
}
