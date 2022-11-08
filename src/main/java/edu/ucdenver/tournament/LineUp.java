package edu.ucdenver.tournament;

import java.util.List;

public class LineUp {
    List<Player> listOfPlayers;
    Team team; // not sure about this

    public LineUp(Team team){
        this.team = team;
    }

    public Team getTeam(){
        return team;
    }

    public void addPlayer(Player player){
        listOfPlayers.add(player);
    }

    public List<Player> getPlayers(){
        return listOfPlayers;
    }
}
