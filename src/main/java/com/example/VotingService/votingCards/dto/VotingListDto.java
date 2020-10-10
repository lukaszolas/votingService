package com.example.VotingService.votingCards.dto;

import lombok.Value;

import java.util.List;

@Value
public class VotingListDto {
    private int numberOfParty;
    private List<CandidateDto> candidates;
}
