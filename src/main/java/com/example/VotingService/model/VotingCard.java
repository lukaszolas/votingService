package com.example.VotingService.model;

import com.example.VotingService.dto.VotingDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class VotingCard {

    private Long id;
    private Long electionId;
    private List<Integer> electionList;

    VotingDto toDto(){
        return new VotingDto(id, electionId, electionList);
    }
}
