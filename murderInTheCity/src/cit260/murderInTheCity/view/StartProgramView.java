/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.view;

import cit260.murderInTheCity.control.GameControl;
import cit260.murderInTheCity.model.Player;
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
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                + "The name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        // if unsuccessful
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        
        //display next view
        this.displayNextView(player);
        
        // success !
        return true;
    }

    private void displayNextView(Player player) {
        // display a custom welcome message
        System.out.println("\n======================================="
                         + "\n Welcome to the game " + player.getName()
                         + "\n We are depending on you to help us catch the killer."
                         + "\n Good luck, you will need it!"
                         + "\n======================================="
                         );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }
}
