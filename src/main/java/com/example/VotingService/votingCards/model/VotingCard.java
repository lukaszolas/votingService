package com.example.VotingService.votingCards.model;

import com.example.VotingService.votingCards.dto.VotingCardDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class VotingCard {

    private List<VotingList> votingCard;

    VotingCardDto toDto(){
        return new VotingCardDto(votingCard.stream().map(x -> x.toDto()).collect(Collectors.toList()));
    }
}
