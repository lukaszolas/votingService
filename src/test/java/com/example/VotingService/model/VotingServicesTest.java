package com.example.VotingService.model;

import com.example.VotingService.dto.VotingDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@SpringBootTest
class VotingServicesTest {

    @Autowired
    VotingServices votingServices;

    @MockBean
    RestTemplate restTemplate;

    @Test
    void shouldConvertDtoToEntity(){

        //given
        VotingCardDto votingCardDto = new VotingCardDto();
        votingCardDto.setVotingCard(new VotingDto(1L, 1L, new ArrayList<>()));
        ResponseEntity responseEntity = new ResponseEntity<>(votingCardDto ,HttpStatus.OK);

        when(restTemplate.getForEntity(anyString(),any())).thenReturn(responseEntity);

        //when
        VotingCard votingCardList = votingServices.getVotingCardList(1L);

        //then
        assertEquals(1L, votingCardList.getId());
        assertEquals(1L, votingCardList.getElectionId());
        assertTrue(votingCardList.getElectionList().isEmpty());
    }
}