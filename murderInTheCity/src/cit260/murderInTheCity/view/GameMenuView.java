/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.view;

import cit260.murderInTheCity.control.CaseControl;
import cit260.murderInTheCity.control.GameControl;
import cit260.murderInTheCity.model.Item;
import cit260.murderInTheCity.model.Location;
import cit260.murderInTheCity.model.Map;
import java.util.Scanner;
import murderinthecity.MurderInTheCity;

/**
 *
 * @author Brad Bastian
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n--------------------------------------"
                + "\n| Game Menu "
                + "\nV - View map"
                + "\nE - Evidence list"
                + "\nL - Suspect List"
                + "\nT - Calculate time of death"
                + "\nD - Calculate search radius"
                + "\nZ - Solve the crime"
                + "\nM - Drive around the city"
                + "\nQ - Return to Main Menu"
                + "\n======================================"
                + "\n\nPlease enter an option: ");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "V": // view map
                this.viewMap();
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

    private void viewMap() {
        Map[] maps = MurderInTheCity.getCurrentGame().getMaps();
        Map tempeMap = maps[0];
        Location[][] tempeMapLocations = tempeMap.getLocations();
        Location block;

        System.out.println("\n" + tempeMap.getName() + "\n");

        char alphabet = 'A';
        for (int c = 0; c < tempeMap.getColumnCount(); c++) {
            System.out.print("\t" + alphabet);
            alphabet++;
        }
        //System.out.println("\n");
        for (int i = 0; i < tempeMap.getRowCount(); i++) {
            System.out.println("\n--------------------------------------------"
                    + "----------------");
            System.out.print(i + 1);

            for (int j = 0; j < tempeMap.getColumnCount(); j++) {
                System.out.print("   |");
                block = tempeMapLocations[i][j];

                if (block.isVisited()) {
                    System.out.print("\tX");
                } else {
                    System.out.print("\t?");
                }
                //System.out.print(" |");
            }
            System.out.print("  |");
        }
        System.out.println("\n---------------------------------------------"
                + "---------------");
    }

    /*
    private void viewCityLocations() {
        CityMenuView cityMenuView = new CityMenuView();
        cityMenuView.display();
    }
     */
    private void evidenceList() {
        // get the list of evidence the player has collected
        Item[] evidence = GameControl.getEvidenceList();

        System.out.println("\nList of collected evidence");

        // for each piece of evidence
        for (Item item : evidence) {
            // DISPLAY the name and description
            System.out.println("Name: " + item.getName()
                    + "\nDescription: " + item.getDescription());
        }
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

    private void solveCrime() {
        System.out.println("solveCrime function called");
    }

    private void moveAroundCity() {
        DriveView driveView = new DriveView();
        driveView.display();
    }

}
