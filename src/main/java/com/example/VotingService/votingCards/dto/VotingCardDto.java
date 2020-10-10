package com.example.VotingService.votingCards.dto;


import lombok.Value;

import java.util.List;

@Value
public class VotingCardDto {

    private List<VotingListDto> votingLists;
}
