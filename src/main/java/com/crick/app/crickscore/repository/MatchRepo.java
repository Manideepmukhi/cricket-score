package com.crick.app.crickscore.repository;
import com.crick.app.crickscore.entities.*;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepo extends JpaRepository<Match,Integer>{

     Optional<Match> findByTeamHeading(String teamHeading);
} 
