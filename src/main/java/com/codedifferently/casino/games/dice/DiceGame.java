package com.codedifferently.casino.games.dice;

import com.codedifferently.casino.games.Game;

import java.util.ArrayList;
import java.util.List;

public abstract class DiceGame implements Game {

    private List<Die> dice;

    public DiceGame(){
        this.dice = new ArrayList<>();
        this.initializeDice(2);
    }

    public DiceGame(Integer sides){
        this.dice = new ArrayList<>();
        this.initializeDice(2, sides);
    }

    public DiceGame(Integer amount, Integer sides){
        this.dice = new ArrayList<>();
        this.initializeDice(amount, sides);
    }

    public Integer rollDice(){
        int amount = 0;
        for(Die die : dice){
            amount += die.roll();
        }
        return amount;
    }

    private void initializeDice(Integer amount){
        for(int x = 0 ; x < amount; x++){
            Die die = new Die();
            dice.add(die);
        }
    }
    private void initializeDice(Integer amount, Integer sides){
        for(int x = 0 ; x < amount; x++){
            Die die = new Die(sides);
            dice.add(die);
        }
    }
}
