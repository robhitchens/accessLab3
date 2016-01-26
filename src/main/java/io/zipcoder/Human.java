package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/24/16.
 */
import java.util.Scanner;
public class Human {
    private String playerChoice;
    public Human(String userin){
        setUserInput(userin);
    }
    public Human(){
        System.out.println("std player.");
    }

    public void scanUserInput(String message){
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        String user_input = input.nextLine();
        playerChoice = user_input;

    }
    public void setUserInput(String input){
        playerChoice = input;
    }
    public String getUserInput(){return playerChoice;}
}
