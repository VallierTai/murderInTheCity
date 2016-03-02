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
public abstract class View implements ViewInterface {
    protected String displayMessage;
    public View() {
    }
    public View(String message){
        this.displayMessage = message;
    }
    @Override
     public void display() {
        boolean done = false; // set flag to not done
        do { 
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))
                    // user wants to quit
                    return; // exit the game
            // do the requested action and display the next view
            done = this.doAction(value);
        } while (!done);
     }
       public String getInput() {
       
        Scanner keyboard = new Scanner(System.in);
        String value = null;
        
        // set flag to invalid value entered
        boolean valid = false;
        // while a valid name has not been retrieved
        while(!valid) {
            // display menu
            System.out.println("\n" + this.displayMessage);
            
            // get the name from the keyboard
            value = keyboard.nextLine();
            // trim off the excess blanks
            value = value.trim();
            
            // if the name is invalid (less than one character in length)
            if (value.length() < 1) {
                System.out.println("\n *** You must enter a value ***");
                // and repeat again
                continue;
            }
            // set flag to end repetition
            break;
        }
        // return the value
        return value;
    }  
       
    } 
    

