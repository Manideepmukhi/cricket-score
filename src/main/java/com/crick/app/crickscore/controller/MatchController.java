package com.crick.app.crickscore.controller;
import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crick.app.crickscore.entities.Match;
import com.crick.app.crickscore.service.MatchService;

@RestController
@RequestMapping("/match")
@CrossOrigin(origins = "http://localhost:3000")
public class MatchController {
	
	private MatchService matchSevice;

	public MatchController(MatchService matchSevice) {
		super();
		this.matchSevice = matchSevice;
	}

	@GetMapping("/Live")
	public ResponseEntity<List<Match>> getLiveMatches(){
		return new ResponseEntity<>(this.matchSevice.getLiveMatches(),HttpStatus.OK);
		
	}
	
	@GetMapping
	public ResponseEntity<List<Match>> getAllMatches(){
		return new ResponseEntity<>(this.matchSevice.getAllMatches(),HttpStatus.OK);
		
	}
}
