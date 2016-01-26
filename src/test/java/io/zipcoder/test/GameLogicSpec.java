package io.zipcoder.test;

/**
 * Created by roberthitchens3 on 1/24/16.
 */
import io.zipcoder.Game;
import org.junit.Test;
import static org.junit.Assert.*;
public class GameLogicSpec {

    @Test
    public void testGameLogic(){
        String[] user = {"ROCK","PAPER","SCISSORS"};
        Game game = new Game(3, user);

    }

}
