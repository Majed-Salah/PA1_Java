package edu.ucdenver.tournament;

import javafx.scene.shape.Line;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Match {
    private LocalDate dateTime;
    private int scoreTeamA;
    private int scoreTeamB;
    private ArrayList<Referee> matchReferees;
    Team teamA;
//    LineUp teamA
    Team teamB;

    public Match(LocalDate dateTime, Team teamA, Team teamB){
        this.dateTime = dateTime;
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public LineUp getTeamA(){
        return new LineUp(teamA);
    }

    public LineUp getTeamB(){
        return new LineUp(teamB);
    }

    public boolean isUpcoming(){
        if ()
    }

    public void addPlayer(Player player, Team team){

    }

    public List<Referee> getReferees(){
        return matchReferees;
    }

    public void addReferee(Referee ref){
        // TODO Need to handle exception if already exists
        matchReferees.add(ref);
    }

    public void setMatchScore(int scoreA, int scoreB){
        this.scoreTeamA = scoreA;
        this.scoreTeamB = scoreB;
    }
}
