package edu.ucdenver.tournament;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tournament {
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private ArrayList<Team> listTeams;
    private ArrayList<Country> participatingCountries;
    private ArrayList<Referee> listReferees;

    public Tournament(String name, LocalDate startDate, LocalDate endDate){
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.listTeams = new ArrayList<>();
        this.participatingCountries = new ArrayList<>();
        this.listReferees = new ArrayList<>();
    }

    public void addTeam(String name, String country){
        Country teamCountry = null;
        try {
            for (Country c : participatingCountries) {
                if (c.getCountryName().equals(country)) {
                    teamCountry = c;
                }
            }
            Team team = new Team(name, teamCountry);
            listTeams.add(team);
        }
        catch(Exception e){
            System.err.println("Country not participating: " + e);
        }
    }

    public void addCountry(String country){
        Country c = new Country(country);
        this.participatingCountries.add(c);
    }

    public void addReferee(String name, String country){

    }

    public void addPlayer(String teamName, String playerName, int age, double height, double weight){

    }

    public void addMatch(LocalDate dateTime, String refereeName){

    }

    public void addRefereeToMatch(LocalDate dateTime, String refereeName){

    }

    public void addPlayerToMatch(LocalDate dateTime, String teamName, String playerName){

    }

    public void setMatchScore(LocalDate matchDate, int team1Score, int team2Score){

    }

    public ArrayList<Match> getUpcomingMatches(){

    }

    public ArrayList<Match> getMatchesOn(LocalDate matchDate){

    }

    public ArrayList<Match> getMatchesFor(String teamName){

    }

    public ArrayList<LineUp> getMatchLineUps(LocalDate matchDate){

    }


}
