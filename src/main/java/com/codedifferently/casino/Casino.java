package com.codedifferently.casino;

import com.codedifferently.casino.games.Game;
import com.codedifferently.casino.games.cards.GoFish;
import com.codedifferently.casino.games.dice.Craps;
import com.codedifferently.casino.games.players.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Casino {
    private Scanner scanner;
    private List<Game> games;
    public Casino(){
        scanner = new Scanner(System.in);
        games = new ArrayList<>();
        loadAllGames();
    }

    private void loadAllGames(){
        games.add(new GoFish());
        games.add(new Craps());

    }

    private void displayMainMenu(){
        String menu = "Please select from the following games:\n";
        for(int x = 0 ; x < games.size(); x++ ){
            Game game = games.get(x);
            String menuOption = game.getMenuOption();
            menu += String.format("%d) %s.\n", x, menuOption);
        }
        System.out.println(menu);
        Integer selection = scanner.nextInt();
        Game game = games.get(selection);
        game.play(new Player());
    }

    public void start(){
        displayMainMenu();
    }


    public static void main(String[] args) {
        Casino casino = new Casino();
        casino.start();
    }
}
