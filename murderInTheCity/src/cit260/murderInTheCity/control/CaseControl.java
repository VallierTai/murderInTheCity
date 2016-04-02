/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Brad Bastian
 */
public class CaseControl {

    public static String calculateTimeOfDeath(double bodyTemp, double roomTemp) {
        String foundBody = "6:00 AM";
        SimpleDateFormat sdf = new SimpleDateFormat("h:mm a");
        String timeOfDeath = "";
        int timeSinceDeath = 0;

        Calendar cal = Calendar.getInstance(); // creates calendar

        try {
            Date timeBodyWasFound = sdf.parse(foundBody);
            cal.setTime(timeBodyWasFound);

            if (bodyTemp >= 90 && bodyTemp <= 106
                    && roomTemp >= 50 && roomTemp <= 120) {
                if (roomTemp > 98 && bodyTemp > 98) {
                    timeSinceDeath = (int) Math.round((bodyTemp - 98) / 1.5);
                    cal.add(Calendar.HOUR_OF_DAY, -timeSinceDeath);
                    timeOfDeath = sdf.format(cal.getTime());
                } else if (roomTemp < 98 && bodyTemp < 98) {
                    timeSinceDeath = (int) Math.round((98 - bodyTemp) / 1.5);
                    cal.add(Calendar.HOUR_OF_DAY, -timeSinceDeath);
                    timeOfDeath = sdf.format(cal.getTime());
                } else {
                    return "\nRoom temperature and body temperature don't match\n"
                            + "(body and ambient temperatures must both be higher"
                            + " or both be lower than 98.6 degrees)";
                }
            } else {
                return "\nInvalid input (see Help Menu for valid ranges)";
            }

            return "\nVictim died at " + timeOfDeath;
        } catch (ParseException ex) {
            return "\nInvalid time";
        }

    }

    public static boolean isPersonASuspect(int timeSinceDeath, int speedOfTravel) {
        boolean suspect = false;
        int suspectRadius = speedOfTravel * timeSinceDeath;
        int searchRadius = timeSinceDeath * 3;

        if (suspectRadius <= searchRadius) {
            suspect = true;
        }
        return suspect;

    }

    public static int validateSuspectsAlibi(int speedOfTravel, int timeSinceDeath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
