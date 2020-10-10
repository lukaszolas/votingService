package com.example.VotingService.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "VOTING")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class VotingCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long electionId;
    private List<List> electionList;

}
