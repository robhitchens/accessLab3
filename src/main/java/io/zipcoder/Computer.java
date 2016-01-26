package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/24/16.
 */
public class Computer {

    private enum Choice{ROCK, PAPER, SCISSOR;
        public static Choice getRandom() {
            return values()[(int) (Math.random() * values().length)];
        }
    }

    private String computerChoice;
    public void genChoice(){
        computerChoice = Choice.getRandom().name();
    }
    public void genChoice(String lastUserChoice){
        int rand = ((int)(Math.random()*10))%2;
        if(lastUserChoice.equals("ROCK")){
            //semi random choice;
            switch(rand){
                case 0: computerChoice = "PAPER";
                    break;
                case 1: computerChoice = "SCISSORS";
                    break;
            }
        }else if(lastUserChoice.equals("PAPER")){
            switch(rand) {
                case 0:
                    computerChoice = "ROCK";
                    break;
                case 1:
                    computerChoice = "SCISSORS";
                    break;
            }
        }else if(lastUserChoice.equals("SCISSORS")){
            switch(rand){
                case 0: computerChoice = "ROCK";
                    break;
                case 1: computerChoice = "PAPER";
                    break;
            }
        }

    }
    public String getChoice(){
        return computerChoice;
    }

}
