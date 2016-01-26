package io.zipcoder;


/**
 * Created by roberthitchens3 on 1/24/16.
 */
public class Game {
    private int playerScore;
    private int comScore;
    private String winner;
    public static void main(String[] args) {
        Game game = new Game(3);
    }
    public Game(int rounds){
        playerScore = 0;
        comScore = 0;

        Computer com = new Computer();
        Human hu = new Human();
        String lastInput =null;
        for (int i = 0; i < rounds; i++) {
            hu.scanUserInput("Enter ROCK, PAPER, or SCISSORS: ");
            if(i >0){
                com.genChoice(lastInput);
            }else {
                com.genChoice();
            }
            playGame(hu.getUserInput(), com.getChoice());
            lastInput = hu.getUserInput();
        }
        printWinner();
    }
    public Game(int rounds, String[] userInput){//overloaded constructor for testing
        playerScore = 0;
        comScore = 0;

        Computer com = new Computer();
        Human hu = new Human();
        String lastInput = null;
        for(int i = 0; i< rounds; i++){
            if(i>0){
                com.genChoice(lastInput);
            }else {
                com.genChoice();
            }
            hu.setUserInput(userInput[i]);
            playGame(hu.getUserInput(), com.getChoice());
            lastInput = hu.getUserInput();
        }
        printWinner();

    }
    public void playGame(String userInput, String comInput){

        System.out.println("computer threw: "+ comInput);
        if(userInput.equals("ROCK") && comInput.equals("SCISSORS")){
            playerScore++;
        }else if(userInput.equals("ROCK") && comInput.equals("PAPER")){
            comScore++;
        }else if(userInput.equals("SCISSORS")&& comInput.equals("ROCK")){
            comScore++;
        }else if(userInput.equals("SCISSORS")&& comInput.equals("PAPER")){
            playerScore++;
        }else if(userInput.equals("PAPER")&& comInput.equals("SCISSORS")){
            comScore++;
        }else if(userInput.equals("PAPER")&& comInput.equals("ROCK")){
            playerScore++;
        }
    }
    public void printWinner(){
        if(playerScore>comScore){
            winner ="Player";
        }else{
            winner = "Computer";
        }
        System.out.println(winner + " a winner is you!");
    }
}
