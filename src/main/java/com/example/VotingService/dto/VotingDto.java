package com.example.VotingService.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class VotingDto {

    private Long id;

    @JsonProperty("idElection")
    private Long electionId;

    @JsonProperty("electionList")
    private List<Integer> electionList;
}
