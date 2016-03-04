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
                + "\nS - How to calculate search radius"
                + "\nV - How to validate a suspect's alibi"
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
