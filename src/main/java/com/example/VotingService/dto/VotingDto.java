package com.example.VotingService.dto;

import lombok.Value;

import java.util.List;

@Value
public class VotingDto {

    private Long id;
    private Long electionId;
    private List<List> electionList;
}
