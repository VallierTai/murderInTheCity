/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.view;

import cit260.murderInTheCity.control.CaseControl;
import cit260.murderInTheCity.model.Case;
import java.util.Scanner;

/**
 *
 * @author Tai
 */
public class ValidateSuspectsAlibiView {

    int speedOfTravel;
    int timeOfDeath;

    public ValidateSuspectsAlibiView() {

    }

    public void display() {
        System.out.println("\n to validate suspects Alibi. You will need "
                + "time of death and speed of travel");

        getInput();

    }

    public void getInput() {
        int speedOfTravel = 0;
        int timeOfDeath = 0;
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
                System.out.println("\nEnter victim's time of death (i.e. '2' for 2:00 AM): ");
                timeOfDeath = keyboard.nextInt();

                if (timeOfDeath != 12
                        || timeOfDeath != 1
                        || timeOfDeath != 2
                        || timeOfDeath != 3
                        || timeOfDeath != 4
                        || timeOfDeath != 5) {
                    System.out.println("Time of death is not valid must be between 12AM and 5AM)");
                    timeOfDeathValid = false;
                } else {
                    timeOfDeathValid = true;
                }
            } while (timeOfDeath == 0);
        }
        doAction(speedOfTravel, timeOfDeath);

    }

    public void doAction(int speedOfTravel, int timeSinceDeath) {
        //int suspectsAlibi = CaseControl.validateSuspectsAlibi(speedOfTravel, timeSinceDeath);

        //        System.out.println(suspectsAlibi);
    }

}
