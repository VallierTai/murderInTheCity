/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.view;

import cit260.murderInTheCity.control.GameControl;
import java.util.Scanner;
import murderinthecity.MurderInTheCity;

/**
 *
 * @author Brad Bastian
 */
public class MainMenuView
{ 
    private String menu;
    private String promptMessage = "\nPlease enter an option: ";
    public MainMenuView(){
        this.menu = "\n"
                +"\n--------------------------------------"
                +"\n| Main Menu "
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n======================================";
     }
                
               

    void displayMainMenuView() {
        boolean done = false; // set flag to not done
        do { 
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                    // user wants to quit
                    return; // exit the game
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
       
    }    

    private String getMenuOption() {
       
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        
        // set flag to invalid value entered
        boolean valid = false;
        // while a valid name has not been retrieved
        while(!valid) {
            // display menu
            System.out.println(this.menu);
            
            // prompt for the player's option
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
        

    public boolean doAction(String choice) {
        
       choice = choice.toUpperCase(); // convert choice to upper case
       
       switch (choice){
           case "N": // create and starta new game
               this.startNewGame();
               break;
           case "G": // get and start an exisiting game
               this.startExistingGame();
               break;
           case "H": // display the help menu
               this.displayHelpMenu();
               break;
           case "S": // save the current game
               this.saveGame();
               break;
           default:
               System.out.println("\n*** Invalid selection *** Try again");
               break;
       }              
        return false;       
    }           

    private void startNewGame() {
        GameControl.createNewGame(MurderInTheCity.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        
        // display the help menu
        helpMenu.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("*** startExistingGame function called ***");
        
    }
 
    
}

 