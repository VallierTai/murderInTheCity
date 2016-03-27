/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.view;

import cit260.murderInTheCity.control.GameControl;
import cit260.murderInTheCity.model.Item;
import cit260.murderInTheCity.model.Character;
import java.io.FileWriter;
import java.util.Arrays;

/**
 *
 * @author Brad Bastian
 */
class ReviewCaseFileView extends View {

    public ReviewCaseFileView() {
        super("\n"
                + "\n--------------------------------------"
                + "\n| Review Case File Menu "
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

    private void evidenceList() {
        boolean result = false;
        
        //If the Case File name is invalid prompt them to re-enter a case file.
        while(!result) {
            System.out.println("\nEnter the Case File Name: ");
            String caseFile = System.console().readLine();
            result = this.printEvidenceReport(caseFile);
            if(!result) {
                System.out.println("\n\nInvalid Case File Name.\n\n");
            }
        }
        
        //Display the success message
        System.out.println("\n\nCase File evidence list successfully printed.\n");
    }

    private void viewPossibleMurderWeapons() {
        Item[] weapons = GameControl.getWeaponsList();
        Arrays.sort(weapons);
        try {
            System.out.println("\nList of collected weapons");

            // for each piece of evidence
            for (Item weapon : weapons) {
                // DISPLAY the name and description
                System.out.println("Name: " + weapon.getName()
                        + "\nDescription: " + weapon.getDescription());
            }
        } catch (Exception e) {
            System.out.println("failure to get weapon");
        }

    }

    private void suspectList() {
        Character[] suspects = GameControl.getSuspectList();
        Arrays.sort(suspects);

        System.out.println("\nList of suspects");

        // for each piece of evidence
        for (Character suspect : suspects) {
            // DISPLAY the name and description
            System.out.println("Name: " + suspect.getName()
                    + "\nDescription: " + suspect.getDescription());
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
            Item[] evidence = GameControl.getEvidenceList();

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
        System.out.println("solveCrime function called");
    }
}
