/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.exceptions;

/**
 *
 * @author Tai
 */
public class CharacterControl extends Exception{

    public CharacterControl() {
    }

    public CharacterControl(String message) {
        super(message);
    }

    public CharacterControl(String message, Throwable cause) {
        super(message, cause);
    }

    public CharacterControl(Throwable cause) {
        super(cause);
    }

    public CharacterControl(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    

    
    
}
