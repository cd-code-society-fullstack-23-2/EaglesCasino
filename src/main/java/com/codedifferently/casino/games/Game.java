package com.codedifferently.casino.games;

import com.codedifferently.casino.games.players.Player;

public interface Game {
    void play(Player player);
    String getMenuOption();
}
