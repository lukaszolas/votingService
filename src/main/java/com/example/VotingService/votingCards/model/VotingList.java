package com.example.VotingService.votingCards.model;

import com.example.VotingService.votingCards.dto.VotingListDto;
import com.example.VotingService.votingCards.model.Candidate;
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
