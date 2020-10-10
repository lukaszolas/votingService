package com.example.VotingService.model;

import com.example.VotingService.dto.CandidateDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
class Candidate {
    private String pesel;
    private String firstName;
    private String lastName;

    CandidateDto toDto(){
        return new CandidateDto(firstName, lastName);
    }
}
