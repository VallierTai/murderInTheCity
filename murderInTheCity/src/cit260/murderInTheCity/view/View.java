/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import murderinthecity.MurderInTheCity;

/**
 *
 * @author Tai
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;
    protected final BufferedReader keyboard = MurderInTheCity.getInFile();
    protected final PrintWriter console = MurderInTheCity.getOutFile();

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
            {
                return; // exit the game
            }            // do the requested action and display the next view
            done = this.doAction(value);
        } while (!done);
    }

    public String getInput() {

        String value = null;

        // set flag to invalid value entered
        boolean valid = false;
        try {
            // while a valid name has not been retrieved
            while (!valid) {
                // display menu
                this.console.println("\n" + this.displayMessage);

                // get the name from the keyboard
                value = this.keyboard.readLine();
                // trim off the excess blanks
                value = value.trim();

                // if the name is invalid (less than one character in length)
                if (value.length() < 1) {
                    ErrorView.display(this.getClass().getName(),
                            "\n *** You must enter a value ***");
                    // and repeat again
                    continue;
                }
                // set flag to end repetition
                break;
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }

        // return the value
        return value;
    }

    public String getInput(String message) {

        String value = null;

        // set flag to invalid value entered
        boolean valid = false;
        try {
            // while a valid name has not been retrieved
            while (!valid) {
                // display menu
                this.console.println("\n" + message);

                // get the name from the keyboard
                value = this.keyboard.readLine();
                // trim off the excess blanks
                value = value.trim();

                // if the name is invalid (less than one character in length)
                if (value.length() < 1) {
                    ErrorView.display(this.getClass().getName(),
                            "\n *** You must enter a value ***");
                    // and repeat again
                    continue;
                }
                // set flag to end repetition
                break;
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }

        // return the value
        return value;
    }

}
