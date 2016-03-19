/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.view;

import cit260.murderInTheCity.control.CaseControl;
import cit260.murderInTheCity.exceptions.SearchRadiusException;
import cit260.murderInTheCity.model.Case;
import java.text.ParseException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import murderinthecity.MurderInTheCity;

/**
 *
 * @author Tai
 */
public class CalculateSearchRadiusView {

    private int speedOfTravel;
    private int timeOfDeath;

    public CalculateSearchRadiusView() {

    }

    public void display() {
        System.out.println("\n To calculate the search radius, you will need the victim's time since death"
                + "speedOfTravel.");

        getInput();
    }

    public void getInput() {

        int speedOfTravel = 0;
        String timeOfDeath = "";
        boolean speedOfTravelValid = false;
        boolean timeOfDeathValid = false;

        Scanner keyboard = new Scanner(System.in);

        while (!speedOfTravelValid) {
            do {
                System.out.println("\nEnter suspects speed of travel: ");
                while (!keyboard.hasNextInt()) {
                    System.out.print("\nYou must enter a valid number! Try again: ");
                    keyboard.next();
                }
                speedOfTravel = keyboard.nextInt();
                if (speedOfTravel < 0 || speedOfTravel > 6) {
                    System.out.println("Speed of travel is invalid must be between 0 and 5mph.)");
                    speedOfTravelValid = false;
                } else {
                    speedOfTravelValid = true;
                }
            } while (speedOfTravel == 0);
        }
        while (!timeOfDeathValid) {
            do {
                System.out.println("\nEnter victim's time of death (i.e. '2:00AM'): ");
                timeOfDeath = keyboard.next() + " " + keyboard.next();

                if (!(timeOfDeath != "12:00 AM")
                        || !(timeOfDeath != "1:00 AM")
                        || !(timeOfDeath != "2:00 AM")
                        || !(timeOfDeath != "3:00 AM")
                        || !(timeOfDeath != "4:00 AM")
                        || !(timeOfDeath != "5:00 AM")) {
                    System.out.println("Time of death is not valid, must be between 12:00 AM and 5:00 AM)");
                    timeOfDeathValid = false;
                } else {
                    timeOfDeathValid = true;
                }
            } while (timeOfDeath == "");
        }
        try {
            doAction(speedOfTravel, timeOfDeath);
        } catch (ParseException ex) {
            ex.getMessage();
        }
    }

    public void doAction(int speedOfTravel, String timeOfDeath) throws ParseException {

        String searchRadius = null;

        try {
            CaseControl.calculateSearchRadius(speedOfTravel, timeOfDeath);
        } catch (SearchRadiusException e) {
            e.getMessage();
        } catch (ParseException e) {
            e.getMessage();
        }

        Case[] cases = MurderInTheCity.getCurrentGame().getCases();
        searchRadius = cases[0].getSearchRadius();
        System.out.println(searchRadius);

    }
}
