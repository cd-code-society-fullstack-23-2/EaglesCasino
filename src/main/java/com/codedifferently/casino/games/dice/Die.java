package com.codedifferently.casino.games.dice;

import java.util.Random;

public class Die {
    private Integer sides;
    private Integer currentValue;
    private Random randomizer;

    public Die(){
      this.sides = 6;
      this.currentValue = 0;
      this.randomizer = new Random();
    }

    public Die(Integer sides){
        this.sides = sides;
        this.currentValue = 0;
        this.randomizer = new Random();
    }

    public String toString(){
        return String.format("This die has %d sides", sides);
    }

    public Integer roll(){
        currentValue = randomizer.nextInt(sides)  + 1;
        return currentValue;
    }

    public Integer getSides() {
        return sides;
    }

    public Integer getCurrentValue() {
        return currentValue;
    }
}
