package edu.ucdenver.tournament;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Match {
    private LocalDate dateTime;
    private int scoreTeamA;
    private int scoreTeamB;
    private ArrayList<Referee> matchReferees;
    private Team teamA;
    private Team teamB;
    private LineUp lineUpA = new LineUp(teamA);
    private LineUp lineUpB = new LineUp(teamB);

    public Match(LocalDate dateTime, Team teamA, Team teamB){
        this.dateTime = dateTime;
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public LineUp getTeamA(){
        return lineUpA; // shouldnt these not be new?
    }

    public LineUp getTeamB(){
        return lineUpB;
    }

    public boolean isUpcoming(){
        return LocalDate.now().isBefore(this.dateTime);
    }

    /**
     * Add Player Function:
     * Within the instance of the Match class, the addPlayer function can be passed
     * a player and team instance. The function will add a player to the specified teams LineUp.
     */
    public void addPlayer(Player player, Team team){
        if (team == this.teamA) {
            getTeamA().addPlayer(player);
        }
        else if (team == this.teamB) {
            getTeamB().addPlayer(player);
        }

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


    public LocalDate getDate(){
        return dateTime;
    }

}
