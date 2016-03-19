/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.exceptions;

/**
 *
 * @author Brad
 */
public class SearchRadiusException extends Exception {

    public SearchRadiusException() {
    }

    public SearchRadiusException(String string) {
        super(string);
    }

    public SearchRadiusException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public SearchRadiusException(Throwable thrwbl) {
        super(thrwbl);
    }

    public SearchRadiusException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
