package com.codedifferently.casino.games.dice;

import com.codedifferently.casino.games.players.Player;

public class Craps extends DiceGame{

    public Craps(){
        super();
    }

    public Craps(Integer sides){
        super(sides);
    }

    public Craps(Integer amount, Integer sides){
        super(amount, sides);
    }

    @Override
    public void play(Player player) {
        System.out.println("You are playing Craps");

    }

    @Override
    public String getMenuOption() {
        return "To play Craps";
    }
}
