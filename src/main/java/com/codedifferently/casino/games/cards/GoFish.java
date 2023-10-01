package com.codedifferently.casino.games.cards;

import com.codedifferently.casino.games.players.Player;

public class GoFish extends CardGame{
    @Override
    public void play(Player player) {
        System.out.println("You are playing Go Fish");
    }

    @Override
    public String getMenuOption() {
        return "To play GoFish";
    }
}
