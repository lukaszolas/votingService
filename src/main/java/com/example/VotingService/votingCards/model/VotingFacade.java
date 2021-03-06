package com.example.VotingService.votingCards.model;

import com.example.VotingService.votingCards.dto.VotingCardDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class VotingFacade {

    private final VotingServices resultsCardList;

    public VotingCardDto votingCardList(Long id){
        List<VotingList> votingCardList = resultsCardList.getVotingCardList(id);
        return new VotingCard(votingCardList).toDto();
    }

}
