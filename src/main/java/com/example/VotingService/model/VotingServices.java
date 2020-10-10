package com.example.VotingService.model;

import com.example.VotingService.dto.VotingDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@AllArgsConstructor
class VotingServices {

    private static final String URL = "http://10.10.0.36:8080/voting/";
    private final RestTemplate restTemplate;

    VotingCard getVotingCardList(Long id){
        ResponseEntity<VotingCardDto> response = restTemplate.getForEntity(URL + id, VotingCardDto.class);
        VotingDto body = response.getBody().getVotingCard();
        VotingCard votingCard = new VotingCard(body.getId(), body.getElectionId(), body.getElectionList());
        return votingCard;
    }


}
