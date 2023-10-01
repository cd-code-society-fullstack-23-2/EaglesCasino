package com.codedifferently.casino.games.dice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CrapsTest {

    @Test
    public void rollDiceTest01(){
        Craps craps = new Craps();
        Integer actual = craps.rollDice();
        Assertions.assertTrue(actual >=2 && actual <= 12);
    }

    @Test
    public void rollDiceTest02(){
        Craps craps = new Craps(20);
        Integer actual = craps.rollDice();
        Assertions.assertTrue(actual >=2 && actual <= 40);
    }

    @Test
    public void rollDiceTest03(){
        Craps craps = new Craps(3,6);
        Integer actual = craps.rollDice();
        Assertions.assertTrue(actual >=3 && actual <= 18);
    }

    @Test
    public void getMenuOptionTest01(){
        Craps craps = new Craps();
        String expected = "To play Craps";
        String actual = craps.getMenuOption();
        Assertions.assertEquals(expected, actual);
    }
}
