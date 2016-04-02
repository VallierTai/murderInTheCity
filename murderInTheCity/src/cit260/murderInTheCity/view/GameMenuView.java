/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.view;

import cit260.murderInTheCity.control.MapControl;

/**
 *
 * @author Brad Bastian
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n--------------------------------------"
                + "\n| Game Menu "
                + "\nM - View map"
                + "\nD - Drive around city"
                + "\nT - Calculate time of death"
                + "\nR - Review case file"
                + "\nQ - Return to Main Menu"
                + "\n======================================"
                + "\n\nPlease enter an option: ");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "M": // view map
                this.viewMap();
                break;
            case "D": // drive around city
                this.driveAroundCity();
                break;
            case "T": // calculate time of death
                this.calculateTimeOfDeath();
                break;
            case "R": // review case file
                this.reviewCaseFile();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void viewMap() {
        MapControl.showMap();
    }

    private void driveAroundCity() {
        DriveView driveView = new DriveView();
        driveView.display();
    }

    private void calculateTimeOfDeath() {
        CalculateTimeOfDeathView timeOfDeathView = new CalculateTimeOfDeathView();
        timeOfDeathView.display();
    }

    private void reviewCaseFile() {
        ReviewCaseFileView reviewCaseFileView = new ReviewCaseFileView();
        reviewCaseFileView.display();
    }

    /*
    private void viewCityLocations() {
        CityMenuView cityMenuView = new CityMenuView();
        cityMenuView.display();
    }
     */
}
