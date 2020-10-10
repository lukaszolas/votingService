package com.example.VotingService.model;

import com.example.VotingService.dto.VotingDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@AllArgsConstructor
class VotingServices {

    private final RestTemplate restTemplate;

    VotingCard getVotingCardList(Long id){
        ResponseEntity<VotingDto> response = restTemplate.getForEntity("http://localhost:8082/votingCardList/" + id, VotingDto.class);
        VotingDto body = response.getBody();
        VotingCard votingCard = new VotingCard(body.getId(), body.getElectionId(), body.getElectionList());
        return votingCard;
    }
}
