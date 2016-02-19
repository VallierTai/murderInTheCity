/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.view;

import java.util.Scanner;

/**
 *
 * @author Brad Bastian
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
              "\n*****************************************"
            + "\n*                                       *"
            + "\n* Game Information                      *"
            + "\n*                                       *"
            + "\n*****************************************"
            );
    }

    public void displayStartProgramView() {
        // set flag to not done
        boolean done = false;
        do {
            // prompt for and get players name
            String playersName = this.getPlayersName();
            // user wants to quit
            if (playersName.toUpperCase().equals("Q")) {
                // exit the game
                return;
            }
            
            // do the requested action and display the next view
            done = this.doAction(playersName);
            
        } while (!done);
        
    }

    private String getPlayersName() {
        // keyboard input stream
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        
        // set flag to invalid value entered
        boolean valid = false;
        // while a valid name has not been retrieved
        while(!valid) {
            // prompt for the player's name
            System.out.println(this.promptMessage);
            
            // get the name from the keyboard
            value = keyboard.nextLine();
            // trim off the excess blanks
            value = value.trim();
            
            // if the name is invalid (less than one character in length)
            if (value.length() < 1) {
                System.out.println("Invalid value - the value can not be blank");
                // and repeat again
                continue;
            }
            // set flag to end repetition
            valid = true;
        }
        // return the value
        return value;
    }

    private boolean doAction(String playersName) {
        return true;
    }
}
