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
public class HelpMenuView {
    private String menu;
    private String promptMessage = "\nPlease enter an option: ";
    public HelpMenuView(){
        this.menu = "\n"
                +"\n--------------------------------------"
                +"\n| Help Menu "
                + "\nP - Purpose of the game"
                + "\nM - How to move in the game"
                + "\nT - How to calculate time of death"
                + "\nS - How to calculate search radius"
                + "\nV - How to validate a suspect's alibi"
                + "\nQ - Return to Main Menu"
                + "\n======================================";
     }
    
    void displayHelpMenuView() {
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
           case "P": // display purpose of the game
               this.purposeOfGame();
               break;
           case "M": // display how to move in the game
               this.howToMove();
               break;
           case "T": // display how to calculate time of death
               this.howToCalculateTimeOfDeath();
               break;
           case "S": // display how to calculate search radius
               this.howToCalculateSearchRadius();
               break;
            case "V": // display how to validate a suspect's alibi
               this.howToValidateSuspectsAlibi();
               break;
           default:
               System.out.println("\n*** Invalid selection *** Try again");
               break;
       }              
        return false;       
    }           

    private void purposeOfGame() {
        System.out.println("\n purposeOfGame function called");
    }

    private void howToMove() {
        System.out.println("\n howToMove function called");
    }

    private void howToCalculateTimeOfDeath() {
        System.out.println("\n howToCalculateTimeOfDeath function called");
    }

    private void howToCalculateSearchRadius() {
        System.out.println("\n howToCalculateSearchRadius function called");
    }

    private void howToValidateSuspectsAlibi() {
        System.out.println("\n howToValidateSuspectsAlibi function called");
    }
}
