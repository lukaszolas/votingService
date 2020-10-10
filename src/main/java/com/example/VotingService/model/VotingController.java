package com.example.VotingService.model;

import com.example.VotingService.dto.VotingDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
class VotingController {

    private final VotingFacade votingFacade;

    @GetMapping("/cards/{id}")
    ResponseEntity<VotingDto> votingCardId(@PathVariable Long id){
        VotingCard cardsId = votingFacade.votingCardList(id);
        return new ResponseEntity<>(cardsId.toDto(), HttpStatus.OK);
    }
}
