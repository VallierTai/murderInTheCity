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
public class GameControl extends Exception {

    public GameControl() {
    }

    public GameControl(String message) {
        super(message);
    }

    public GameControl(String message, Throwable cause) {
        super(message, cause);
    }

    public GameControl(Throwable cause) {
        super(cause);
    }

    public GameControl(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
