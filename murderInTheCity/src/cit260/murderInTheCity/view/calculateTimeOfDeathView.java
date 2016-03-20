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
public class calculateTimeOfDeathView {

    public calculateTimeOfDeathView() {

    }

    public void display() {
        System.out.println("\nCalculate time of death. You will need the victim's"
                + "body temperature and the ambient temperature.");

        getInput();
    }

    public void getInput() {
        double bodyTemp = 0;
        double roomTemp = 0;
        boolean bodyTempValid = false;
        boolean roomTempValid = false;

        Scanner keyboard = new Scanner(System.in);

        while (!bodyTempValid) {
            do {
                System.out.println("\nEnter victim's body temperature: ");
                while (!keyboard.hasNextDouble()) {
                    System.out.print("\nYou must enter a valid number! Try again: ");
                    keyboard.next();
                }
                bodyTemp = keyboard.nextDouble();
                if (bodyTemp < 90 || bodyTemp > 106) {
                    System.out.println("Body temperature is not valid (must "
                            + "be between 90-106 degrees)");
                    bodyTempValid = false;
                } else {
                    bodyTempValid = true;
                }
            } while (bodyTemp == 0);
        }
        while (!roomTempValid) {
            do {
                System.out.println("\nEnter victim's ambient temperature: ");
                while (!keyboard.hasNextDouble()) {
                    System.out.print("\nYou must enter a valid number! Try again: ");
                    keyboard.next();
                }
                roomTemp = keyboard.nextDouble();
                if (roomTemp < 50 || roomTemp > 120) {
                    System.out.println("Ambient temperature is not valid (must "
                            + "be between 50-120 degrees)");
                    roomTempValid = false;
                } else {
                    roomTempValid = true;
                }
            } while (roomTemp == 0);
        }
        try {
        doAction(bodyTemp, roomTemp);
        } catch (Exception ex) {
            ex.getMessage();
        }
    } 

    public void doAction(double bodyTemp, double roomTemp) {
        String timeOfDeath = "";
    try {
        timeOfDeath = CaseControl.calculateTimeOfDeath(bodyTemp, roomTemp);
    } catch (Exception e){
        System.out.println(timeOfDeath);
    }
}
}
