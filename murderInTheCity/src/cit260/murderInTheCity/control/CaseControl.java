/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brad Bastian
 */
public class CaseControl {
    
    public int calculateSearchRadius(int speedOfTravel, String timeOfDeath)
    {
        int radius = 0;
        long timeSinceDeath = 0;
        
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("h:mm a");
            Date before = sdf.parse("1:00 AM");
            Date after = sdf.parse("5:00 AM");
            Date toCheck = sdf.parse(timeOfDeath);
            Date currentTime = sdf.parse("6:00 AM");
            
            boolean isTimeValid = (before.getTime() <= toCheck.getTime()) && 
                    after.getTime() >= toCheck.getTime();
            
            if (speedOfTravel > 0 && speedOfTravel <= 5 && isTimeValid) {
                timeSinceDeath = currentTime.getTime() - toCheck.getTime();
                timeSinceDeath = timeSinceDeath / (60 * 60 * 1000);
                radius = (int)(timeSinceDeath * speedOfTravel);
            }
            else {
                return -1;
            }
            
        } catch (ParseException ex) {
            return -1;
        }
        
        return radius;
    }
}
