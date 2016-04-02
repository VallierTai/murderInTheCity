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
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n--------------------------------------"
                + "\n| Help Menu "
                + "\nP - Purpose of the game"
                + "\nM - How to move in the game"
                + "\nT - How to calculate time of death"
                + "\nS - How to solve the murder"
                + "\nQ - Return to Main Menu"
                + "\n======================================"
                + "\n\nPlease enter an option: ");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "P": // display purpose of the game
                this.purposeOfGame();
                break;
            case "M": // display how to move in the game
                this.howToMove();
                break;
            case "S": // display how to solve the crime
                this.solveCrime();
                break;
            case "T": // display how to calculate time of death
                this.howToCalculateTimeOfDeath();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void purposeOfGame() {
        System.out.println("\nThe purpose of the game is to find the murderer and"
                + "\nsolve the crime. You do this by driving around the city"
                + "\ncollecting evidence, murder weapons, and suspects. Once you"
                + "\ncollect all of it you should be able to solve the crime.");
    }

    private void howToMove() {
        System.out.println("\nGo to the Game Menu and select 'Drive around city'."
                + "\nThen you can choose to go North, South, East or West.");
    }

    private void howToCalculateTimeOfDeath() {
        System.out.println("\nGo to the Game Menu and select 'Calculate time of "
                + "\ndeath'. The body temperature must be between 90 and 106 degrees. "
                + "\nThe room temperature must be between 50 and 120 degrees.");
    }

    private void solveCrime() {
        System.out.println("\nGo to the Game Menu and then 'Review case file'."
                + "\nYou will be asked to provide the name of the murderer, "
                + "\nweapon used and time of death. If you answer all the "
                + "\nquestions correctly, you will have solved the crime and "
                + "\nyou will be promted to detective.");
    }

}
