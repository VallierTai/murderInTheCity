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
public class CalculateTimeOfDeathException extends Exception {

    public CalculateTimeOfDeathException() {
    }

    public CalculateTimeOfDeathException(String message) {
        super(message);
    }

    public CalculateTimeOfDeathException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalculateTimeOfDeathException(Throwable cause) {
        super(cause);
    }

    public CalculateTimeOfDeathException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
