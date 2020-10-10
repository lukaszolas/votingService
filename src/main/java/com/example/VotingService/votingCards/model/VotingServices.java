package com.example.VotingService.votingCards.model;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
class VotingServices {

    private static final String URL = "http://10.10.0.36:8080/voting/";
    private final RestTemplate restTemplate;

    List<VotingList> getVotingCardList(Long id){
        ResponseEntity<VotingListResponse> response = restTemplate.getForEntity(URL + id, VotingListResponse.class);
        List<VotingList> body = response.getBody().getVotingCard();
        return body.stream().map(x -> new VotingList(x.getNumberOfParty(), x.getCandidates()))
                .collect(Collectors.toList());
    }
}
