package com.example.VotingService.dto;


import lombok.Value;

import java.util.List;

@Value
public class VotingCardDto {

    private List<VotingListDto> votingLists;
}
