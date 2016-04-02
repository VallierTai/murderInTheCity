/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.view;

import cit260.murderInTheCity.control.GameControl;
import cit260.murderInTheCity.control.SolutionControl.tempeSolution;
import cit260.murderInTheCity.model.Case;
import cit260.murderInTheCity.model.Item;
import cit260.murderInTheCity.model.Character;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import murderinthecity.MurderInTheCity;

/**
 *
 * @author Brad Bastian
 */
class ReviewCaseFileView extends View {

    public ReviewCaseFileView() {
        super("\n"
                + "\n--------------------------------------"
                + "\n| Review Case File Menu "
                + "\nC - View case description"
                + "\nE - View evidence"
                + "\nM - View possible murder weapons"
                + "\nS - View suspects"
                + "\nZ - Solve the crime"
                + "\nQ - Return to Main Menu"
                + "\n======================================"
                + "\n\nPlease enter an option: ");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "C": // view case description
                this.caseDescription();
                break;
            case "E": // view evidence
                this.evidenceList();
                break;
            case "M": // view possible murder weapons
                this.viewPossibleMurderWeapons();
                break;
            case "S": // view suspects
                this.suspectList();
                break;
            case "Z": // solve the crime
                this.solveCrime();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void caseDescription() {
        Case[] cases = MurderInTheCity.getCurrentGame().getCases();
        String caseName = cases[0].getName();
        String caseDescription = cases[0].getDescription();
        System.out.println("\n" + "\t" + caseName.toUpperCase() + caseDescription);
    }

    private void evidenceList() {
        // get the list of evidence the player has collected
        ArrayList<Item> evidence = GameControl.getEvidenceList();

        if (!evidence.isEmpty()) {
            System.out.println("\nEVIDENCE LIST");
            // for each piece of evidence
            for (Item e : evidence) {
                // display the name and description
                System.out.println("\nName: " + e.getName()
                        + "\nDescription: " + e.getDescription());
            }
        } else {
            System.out.println("You have not collected any evidence");
        }

    }

    private void viewPossibleMurderWeapons() {
        // get the list of weapons the player has collected
        ArrayList<Item> weapons = GameControl.getWeaponsList();

        if (!weapons.isEmpty()) {
            System.out.println("\nWEAPON LIST");
            // for each piece of evidence
            for (Item weapon : weapons) {
                // display the name and description
                System.out.println("\nName: " + weapon.getName());
            }
        } else {
            System.out.println("\nYou have not collected any possible murder weapons");
        }

    }

    private void suspectList() {
        // get the list of suspects the player has apprehended
        ArrayList<Character> suspects = GameControl.getSuspectList();

        if (!suspects.isEmpty()) {
            System.out.println("\nSUSPECT LIST");
            // for each piece of evidence
            for (Character suspect : suspects) {
                // display the name and description
                System.out.println("\nName: " + suspect.getName()
                        + "\nDescription: " + suspect.getDescription());
            }
        } else {
            System.out.println("\nYou have not apprehended any suspects");
        }
    }

    private boolean printEvidenceReport(String filePath) {
        //if failed to open file return false
        try (FileWriter writer = new FileWriter(filePath)) {

            //Title
            String title = "\n\nEvidence List for Case File: " + filePath + "\n";
            System.out.println(title);
            writer.write(title);

            //Headers
            String headers = "";

            // get the list of evidence the player has collected
            ArrayList<Item> evidence = GameControl.getEvidenceList();

            // for each piece of evidence
            for (Item item : evidence) {
                // DISPLAY the name and description
                System.out.println("Name: " + item.getName()
                        + "\nDescription: " + item.getDescription());

                //Write line to file as well here
            }

            return true;
        } catch (Exception e) {
            String errorMessage = "Error opening file: " + filePath;
            errorMessage += "  Exception: " + e;
            ErrorView.display("ReviewCaseFileView", errorMessage);

            return false;
        }
    }

    private void solveCrime() {

        boolean valid = false;
        String todGuess = "";
        String murdererGuess = "";
        String murderWeaponGuess = "";

        String tod = tempeSolution.timeOfDeath.getGuess();
        String murderer = tempeSolution.murderer.getGuess();
        String murderWeapon = tempeSolution.murderWeapon.getGuess();

        this.console.println("\nReady to solve the crime?"
                + "\nYou need to answer 3 questions correctly. Good luck!");

        while (!valid) {
            this.console.println("\nWhat was the time of death of the victim? (i.e. 2:00am) ");

            try {
                // get the time of death from the keyboard
                todGuess = this.keyboard.readLine();
                // trim off the excess blanks
                todGuess = todGuess.trim();
            } catch (IOException e) {
                this.console.println(e.getMessage());
            }

            // if the name is invalid (less than one character in length)
            if (todGuess.length() < 1) {
                ErrorView.display(this.getClass().getName(),
                        "\n *** You must enter a value ***");
                // and repeat again
                continue;
            }
            // set flag to end repetition
            break;
        }

        while (!valid) {
            this.console.println("\nWho was the murderer? ");

            try {
                // get the time of death from the keyboard
                murdererGuess = this.keyboard.readLine();
                // trim off the excess blanks
                murdererGuess = murdererGuess.trim();
            } catch (IOException e) {
                this.console.println(e.getMessage());
            }

            // if the name is invalid (less than one character in length)
            if (murdererGuess.length() < 1) {
                ErrorView.display(this.getClass().getName(),
                        "\n *** You must enter a value ***");
                // and repeat again
                continue;
            }
            // set flag to end repetition
            break;
        }

        while (!valid) {
            this.console.println("\nWhat was the murder weapon? ");

            try {
                // get the time of death from the keyboard
                murderWeaponGuess = this.keyboard.readLine();
                // trim off the excess blanks
                murderWeaponGuess = murderWeaponGuess.trim();
            } catch (IOException e) {
                this.console.println(e.getMessage());
            }

            // if the name is invalid (less than one character in length)
            if (murderWeaponGuess.length() < 1) {
                ErrorView.display(this.getClass().getName(),
                        "\n *** You must enter a value ***");
                // and repeat again
                continue;
            }
            // set flag to end repetition
            break;
        }

        if (todGuess.toUpperCase().equals(tod.toUpperCase())
                && murdererGuess.toUpperCase().equals(murderer.toUpperCase())
                && murderWeaponGuess.toUpperCase().equals(murderWeapon.toUpperCase())) {
            this.console.println("\nYou solved the crime."
                    + "\n\nCONGRATULATIONS, you have been promoted to detective!"
                    + "\n\nGAME OVER");
            System.exit(0);
        } else {
            this.console.println("\nSorry, you did not choose wisely."
                    + "\n\nGAME OVER");
            System.exit(0);
        }
    }

}
