/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.view;

import cit260.murderInTheCity.control.CaseControl;
import java.util.Scanner;

/**
 *
 * @author Brad Bastian
 */
public class GameMenuView {

    private String menu;
    private String promptMessage = "\nPlease enter an option: ";
    public GameMenuView(){
        this.menu = "\n"
                +"\n--------------------------------------"
                +"\n| Game Menu "
                + "\nC - View city locations"
                + "\nE - Evidence list"
                + "\nL - Suspect List"
                + "\nT - Calculate time of death"
                + "\nD - Calculate search radius"
                + "\nV - Validate a suspect's alibi"
                + "\nZ - Solve the crime"
                + "\nM - Move around city"
                + "\nQ - Return to Main Menu"
                + "\n======================================";
     }
    
    void displayGameMenuView() {
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
           case "C": // view city locations
               this.viewCityLocations();
               break;
           case "E": // evidence list
               this.evidenceList();
               break;
           case "L": // suspect list
               this.suspectList();
               break;
           case "T": // calculate time of death
               this.calculateTimeOfDeath();
               break;
            case "D": // calculate search radius
               this.calculateSearchRadius();
               break;
            case "V": // validate suspect's alibi
               this.validateSuspectsAlibi();
               break;
            case "Z": // solve the crime
               this.solveCrime();
               break;
            case "M": // move around city
               this.moveAroundCity();
               break;
           default:
               System.out.println("\n*** Invalid selection *** Try again");
               break;
       }              
        return false;       
    }      

    private void viewCityLocations() {
        System.out.println("viewCityLocations function called");
    }

    private void evidenceList() {
        System.out.println("evidenceList function called");
    }

    private void suspectList() {
        System.out.println("suspectList function called");
    }

    private void calculateTimeOfDeath() {
        calculateTimeOfDeathView timeOfDeathView = new calculateTimeOfDeathView();
        timeOfDeathView.display();
    }

    private void calculateSearchRadius() {
        CalculateSearchRadiusView searchRadiusView = new CalculateSearchRadiusView();
        searchRadiusView.display();
    }

    private void validateSuspectsAlibi() {
        System.out.println("validateSuspectsAlibi function called");
    }

    private void solveCrime() {
        System.out.println("solveCrime function called");
    }

    private void moveAroundCity() {
        System.out.println("moveAroundCity function called");
    }
    
}
