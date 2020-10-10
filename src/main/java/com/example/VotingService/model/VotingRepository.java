package com.example.VotingService.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VotingRepository extends JpaRepository<Long, VotingCard> {
}
