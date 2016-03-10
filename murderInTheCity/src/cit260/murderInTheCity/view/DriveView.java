/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.view;

/**
 *
 * @author Brad Bastian
 */
public class DriveView extends View {

    public DriveView() {
        super("\n"
                + "\n--------------------------------------"
                + "\n| Drive Menu "
                + "\nN - North"
                + "\nS - South"
                + "\nE - East"
                + "\nW - West"
                + "\nQ - Return to Game Menu"
                + "\n======================================"
                + "\n\nPlease enter an option: ");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "N": // view city locations
                this.driveNorth();
                break;
            case "S": // evidence list
                this.driveSouth();
                break;
            case "E": // suspect list
                this.driveEast();
                break;
            case "W": // calculate time of death
                this.driveWest();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void driveNorth() {
        System.out.println("Called function driveNorth");
    }

    private void driveSouth() {
        System.out.println("Called function driveSouth");
    }

    private void driveEast() {
        System.out.println("Called function driveEast");
    }

    private void driveWest() {
        System.out.println("Called function driveWest");
    }
}
