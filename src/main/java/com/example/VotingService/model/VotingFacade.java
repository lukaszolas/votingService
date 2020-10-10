package com.example.VotingService.model;

import com.example.VotingService.dto.VotingDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class VotingFacade {

    private final VotingServices resultsCardList;

    public VotingCard votingCardList(Long id){
        return resultsCardList.getVotingCardList(id);
    }

}
