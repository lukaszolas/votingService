package com.example.VotingService.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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
    void shouldConvertDtoToEntity() throws JsonProcessingException {

        //given
        String json = getJson();
        ObjectMapper objectMapper = new ObjectMapper();
        VotingListResponse votingListResponse = objectMapper.readValue(json, VotingListResponse.class);
        ResponseEntity responseEntity = new ResponseEntity<>(votingListResponse,HttpStatus.OK);

        when(restTemplate.getForEntity(anyString(),any())).thenReturn(responseEntity);

        //when
        List<VotingList> votingCardList = votingServices.getVotingCardList(1L);

        //then
        VotingList votingCard = votingCardList.get(0);

        assertEquals(4, votingCard.getNumberOfParty());
        assertEquals(3, votingCard.getCandidates().size());

    }

    private String getJson() {
        return "{\n" +
                "  \"votingCard\": [\n" +
                "    {\n" +
                "      \"numberOfParty\": 4,\n" +
                "      \"candidates\": [\n" +
                "        {\n" +
                "          \"pesel\": \"1234658\",\n" +
                "          \"firstName\": \"Jan\",\n" +
                "          \"lastName\": \"Kowalski\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"pesel\": \"1234658\",\n" +
                "          \"firstName\": \"Jan\",\n" +
                "          \"lastName\": \"Kowalski\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"pesel\": \"1234658\",\n" +
                "          \"firstName\": \"Jan\",\n" +
                "          \"lastName\": \"Kowalski\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "    ]\n" +
                "}";
    }
}