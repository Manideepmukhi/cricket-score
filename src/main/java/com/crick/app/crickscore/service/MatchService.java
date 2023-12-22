package com.crick.app.crickscore.service;
import com.crick.app.crickscore.entities.*;
import java.util.*;

public interface MatchService {
   List<Match> getAllMatches();

   List<Match> getLiveMatches();
    
   List<Map<String,String>> getPointTable();
} 
