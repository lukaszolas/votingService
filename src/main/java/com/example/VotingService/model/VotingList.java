package com.example.VotingService.model;

import com.example.VotingService.dto.VotingListDto;
import com.example.VotingService.model.Candidate;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

class VotingList {

    private int numberOfParty;
    private List<Candidate> candidates;

    VotingListDto toDto(){
        return new VotingListDto(numberOfParty, candidates.stream().map(x -> x.toDto()).collect(Collectors.toList()));
    }
}
