package com.codedifferently.casino.games.dice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DieTest {

    @Test
    public void defaultConstructorTest01(){
        Die die = new Die();
        String expected = "This die has 6 sides";
        String actual = die.toString();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void paramConstructorTest01(){
        Die die = new Die(20);
        String expected = "This die has 20 sides";
        String actual = die.toString();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void rollTest01(){
        Die die = new Die();
        Integer actual = die.roll();
        Assertions.assertTrue(actual >=1 && actual <=6, "The roll should be between 1 and 6");
    }

    @Test
    public void rollTest02(){
        Die die = new Die(20);
        Integer actual = die.roll();
        Assertions.assertTrue(actual >=1 && actual <=20, "The roll should be between 1 and 20");
    }

}
