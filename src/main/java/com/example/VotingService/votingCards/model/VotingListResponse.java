package com.example.VotingService.votingCards.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
class VotingListResponse {

    private List<VotingList> votingCard;
}
