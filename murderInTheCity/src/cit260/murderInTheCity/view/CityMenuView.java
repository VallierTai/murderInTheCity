/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.view;

import java.util.Scanner;

/**
 *
 * @author Tai
 */
public class CityMenuView extends View {

    public CityMenuView() {
        super("\n"
                + "\n--------------------------------------"
                + "\n| City Menu "
                + "\nT - Visit Tempe"
                + "\nS - Visit Scottsdale"
                + "\nP - Visit Phoenix"
                + "\nQ - Return to Game Menu"
                + "\n======================================"
                + "\n\nPlease enter an option: ");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "T": // visit Tempe
                this.visitTempe();
                break;
            case "S": // visit Scottsdale
                this.visitScottsdale();
                break;
            case "P": // visit Phoenix
                this.visitPhoenix();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void visitTempe() {
        System.out.println("Called function visitTempe");
    }

    private void visitScottsdale() {
        System.out.println("Called function visitScottsdale");
    }

    private void visitPhoenix() {
        System.out.println("Called function visitPhoenix");
    }
}
