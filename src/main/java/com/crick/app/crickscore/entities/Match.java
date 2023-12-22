package com.crick.app.crickscore.entities;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name="crick_matches")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;

    private String teamHeading;

    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;

    private String bowlTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    @Enumerated
    private MatchStatus status;

    private Date date = new Date();


    // Parameterized constructor
    public Match(String teamHeading, String matchNumberVenue, String battingTeam, String battingTeamScore,
                 String bowlTeam, String bowlTeamScore, String liveText, String matchLink, String textComplete,
                 MatchStatus status, Date date) {
        this.teamHeading = teamHeading;
        this.matchNumberVenue = matchNumberVenue;
        this.battingTeam = battingTeam;
        this.battingTeamScore = battingTeamScore;
        this.bowlTeam = bowlTeam;
        this.bowlTeamScore = bowlTeamScore;
        this.liveText = liveText;
        this.matchLink = matchLink;
        this.textComplete = textComplete;
        this.status = status;
        this.date = date;
    }

    //defult constructor
    public Match()
    {

    }

    //set the match status acc to textcomplete

    public void setMatchStatus()
    {
        this.status = textComplete.isBlank() ? MatchStatus.LIVE : MatchStatus.COMPLETED;

    }


    // Getter and Setter for 'matchId'
    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    // Getter and Setter for 'teamHeading'
    public String getTeamHeading() {
        return teamHeading;
    }

    public void setTeamHeading(String teamHeading) {
        this.teamHeading = teamHeading;
    }

    // Getter and Setter for 'matchNumberVenue'
    public String getMatchNumberVenue() {
        return matchNumberVenue;
    }

    public void setMatchNumberVenue(String matchNumberVenue) {
        this.matchNumberVenue = matchNumberVenue;
    }

    // Getter and Setter for 'battingTeam'
    public String getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    // Getter and Setter for 'battingTeamScore'
    public String getBattingTeamScore() {
        return battingTeamScore;
    }

    public void setBattingTeamScore(String battingTeamScore) {
        this.battingTeamScore = battingTeamScore;
    }

    // Getter and Setter for 'bowlTeam'
    public String getBowlTeam() {
        return bowlTeam;
    }

    public void setBowlTeam(String bowlTeam) {
        this.bowlTeam = bowlTeam;
    }

    // Getter and Setter for 'bowlTeamScore'
    public String getBowlTeamScore() {
        return bowlTeamScore;
    }

    public void setBowlTeamScore(String bowlTeamScore) {
        this.bowlTeamScore = bowlTeamScore;
    }

    // Getter and Setter for 'liveText'
    public String getLiveText() {
        return liveText;
    }

    public void setLiveText(String liveText) {
        this.liveText = liveText;
    }

    // Getter and Setter for 'matchLink'
    public String getMatchLink() {
        return matchLink;
    }

    public void setMatchLink(String matchLink) {
        this.matchLink = matchLink;
    }

    // Getter and Setter for 'textComplete'
    public String getTextComplete() {
        return textComplete;
    }

    public void setTextComplete(String textComplete) {
        this.textComplete = textComplete;
    }

    // Getter and Setter for 'status'
    public MatchStatus getStatus() {
        return status;
    }

    public void setStatus(MatchStatus status) {
        this.status = status;
    }

    // Getter and Setter for 'date'
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
