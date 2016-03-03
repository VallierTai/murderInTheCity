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
public class StartProgramView extends View {
    
    private String promptMessage;
    
    public StartProgramView() {
        super("\n**************************************************************"
            + "\n*                                                            *"
            + "\n* Murder in the City is a game that will have you playing    *"
            + "\n* a detective in the Valley of Arizona. In this game it is   *"
            + "\n* up to you to catch a killer and solve the case. You are an *"
            + "\n* experienced cop that was just promoted to detective. You   *"
            + "\n* will be scouring the cities, looking for clues and talking *"
            + "\n* to witnesses and suspects. It will be your job to not only *"
            + "\n* find the murder weapon, but also decide who the killer is. *"
            + "\n* Once you have solid evidence you may choose to take it to  *"
            + "\n* the DA and prosecute. This will end the case and you can   *"
            + "\n* move on to the next case. You will have a total of three   *"
            + "\n* murders to solve, so let's get started.                    *"
            + "\n*                                                            *"
            + "\n* Be careful, and good luck!                                 *"
            + "\n*                                                            *"
            + "\n**************************************************************"
            + "\n\nPlease enter your name: "
            );
    }

    @Override
    public boolean doAction(String playersName) {
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
        mainMenuView.display();
    }
}
