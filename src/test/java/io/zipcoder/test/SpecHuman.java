package io.zipcoder.test;
import io.zipcoder.Human;

/**
 * Created by roberthitchens3 on 1/25/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;
public class SpecHuman {
    Human hu = new Human();
    @Test
    public void testHumanChoice(){
        hu.setUserInput("ROCK");
        assertNotNull("user input should not be equal to null: ", hu.getUserInput());
    }
}
