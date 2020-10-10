package com.example.VotingService.dto;

import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class VotingDto {

    private Long id;
    private Long electionId;
    private List<List> electionList;
}
