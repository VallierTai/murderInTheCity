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
public class ReviewCaseFileException extends Exception {

    public ReviewCaseFileException() {
    }

    public ReviewCaseFileException(String message) {
        super(message);
    }

    public ReviewCaseFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReviewCaseFileException(Throwable cause) {
        super(cause);
    }

    public ReviewCaseFileException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
