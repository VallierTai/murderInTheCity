/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.view;

import java.io.PrintWriter;
import murderinthecity.MurderInTheCity;

/**
 *
 * @author Brad
 */
public class ErrorView {

    private static final PrintWriter errorFile = MurderInTheCity.getOutFile();
    private static final PrintWriter logFile = MurderInTheCity.getLogFile();

    public static void display(String className, String errorMessage) {

        errorFile.println(
                "-----------------------------------------"
                + "\n- ERROR - " + errorMessage
                + "\n---------------------------------------");

        // log error
        logFile.println(className + " - " + errorMessage);
    }
}
