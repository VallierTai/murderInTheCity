/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brad Bastian
 */
public class CaseControlTest {
    
    public CaseControlTest() {
    }
    
    /**
     * Test cases for calculateSearchRadius
     */
    @Test
    public void testCalculateSearchRadius() {
        /**
        * Test case #1
        */
        System.out.println("calculateSearchRadius");
        int speedOfTravel1 = 4;
        String timeOfDeath1 = "1:00 AM";
        CaseControl instance1 = new CaseControl();
        String expResult1 = "The victim's search radius is 20 miles.";
        String result1 = instance1.calculateSearchRadius(speedOfTravel1, timeOfDeath1);
        assertEquals(expResult1, result1);
    
        /**
        * Test case #2
        */
        System.out.println("calculateSearchRadius");
        int speedOfTravel2 = 4;
        String timeOfDeath2 = "10:00 PM";
        CaseControl instance2 = new CaseControl();
        String expResult2 = "Invalid input";
        String result2 = instance2.calculateSearchRadius(speedOfTravel2, timeOfDeath2);
        assertEquals(expResult2, result2);
    
        /**
        * Test case #3
        */
        System.out.println("calculateSearchRadius");
        int speedOfTravel3 = 2;
        String timeOfDeath3 = "B";
        CaseControl instance3 = new CaseControl();
        String expResult3 = "Invalid date";
        String result3 = instance3.calculateSearchRadius(speedOfTravel3, timeOfDeath3);
        assertEquals(expResult3, result3);
    
        /**
        * Test case #4
        */
        System.out.println("calculateSearchRadius");
        int speedOfTravel4 = 15;
        String timeOfDeath4 = "3:00 AM";
        CaseControl instance4 = new CaseControl();
        String expResult4 = "Invalid input";
        String result4 = instance4.calculateSearchRadius(speedOfTravel4, timeOfDeath4);
        assertEquals(expResult4, result4);
    
        /**
        * Test case #5
        */
        System.out.println("calculateSearchRadius");
        int speedOfTravel5 = 5;
        String timeOfDeath5 = "1:00 AM";
        CaseControl instance5 = new CaseControl();
        String expResult5 = "The victim's search radius is 25 miles.";
        String result5 = instance5.calculateSearchRadius(speedOfTravel5, timeOfDeath5);
        assertEquals(expResult5, result5);
    
        /**
        * Test case #6
        */
        System.out.println("calculateSearchRadius");
        int speedOfTravel6 = 0;
        String timeOfDeath6 = "5:00 AM";
        CaseControl instance6 = new CaseControl();
        String expResult6 = "Invalid input";
        String result6 = instance6.calculateSearchRadius(speedOfTravel6, timeOfDeath6);
        assertEquals(expResult6, result6);
    
        /**
        * Test case #7
        */
        System.out.println("calculateSearchRadius");
        int speedOfTravel7 = 1;
        String timeOfDeath7 = "5:00 AM";
        CaseControl instance7 = new CaseControl();
        String expResult7 = "The victim's search radius is 1 miles.";
        String result7 = instance7.calculateSearchRadius(speedOfTravel7, timeOfDeath7);
        assertEquals(expResult7, result7);
    }

    /**
     * Test of calculateTimeOfDeath method, of class CaseControl.
     */
    @Test
    public void testCalculateTimeOfDeath() {
        /**
         * Test case #1
         */
        System.out.println("calculateTimeOfDeath");
        double bodyTemp1 = 92;
        double roomTemp1 = 65;
        CaseControl instance1 = new CaseControl();
        String expResult1 = "\nVictim died at 2:00 AM";
        String result1 = instance1.calculateTimeOfDeath(bodyTemp1, roomTemp1);
        assertEquals(expResult1, result1);
        
        /**
         * Test case #2
         */
        System.out.println("calculateTimeOfDeath");
        double bodyTemp2 = 85;
        double roomTemp2 = 65;
        CaseControl instance2 = new CaseControl();
        String expResult2 = "\nInvalid input (see Help Menu for valid ranges)";
        String result2 = instance2.calculateTimeOfDeath(bodyTemp2, roomTemp2);
        assertEquals(expResult2, result2);
        
        /**
         * Test case #3
         */
        System.out.println("calculateTimeOfDeath");
        double bodyTemp3 = 92;
        double roomTemp3 = 40;
        CaseControl instance3 = new CaseControl();
        String expResult3 = "\nInvalid input (see Help Menu for valid ranges)";
        String result3 = instance3.calculateTimeOfDeath(bodyTemp3, roomTemp3);
        assertEquals(expResult3, result3);
        
        /**
         * Test case #4
         */
        System.out.println("calculateTimeOfDeath");
        double bodyTemp4 = 100;
        double roomTemp4 = 80;
        CaseControl instance4 = new CaseControl();
        String expResult4 = "\nRoom temperature and body temperature don't match"
                + "\n(body and ambient temperatures must both be higher or both be lower than 98.6 degrees)";
        String result4 = instance4.calculateTimeOfDeath(bodyTemp4, roomTemp4);
        assertEquals(expResult4, result4);
        
        /**
         * Test case #5
         */
        System.out.println("calculateTimeOfDeath");
        double bodyTemp5 = 92;
        double roomTemp5 = 105;
        CaseControl instance5 = new CaseControl();
        String expResult5 = "\nRoom temperature and body temperature don't match"
                + "\n(body and ambient temperatures must both be higher or both be lower than 98.6 degrees)";
        String result5 = instance5.calculateTimeOfDeath(bodyTemp5, roomTemp5);
        assertEquals(expResult5, result5);
        
        /**
         * Test case #6
         */
        System.out.println("calculateTimeOfDeath");
        double bodyTemp6 = 92;
        double roomTemp6 = 125;
        CaseControl instance6 = new CaseControl();
        String expResult6 = "\nInvalid input (see Help Menu for valid ranges)";
        String result6 = instance6.calculateTimeOfDeath(bodyTemp6, roomTemp6);
        assertEquals(expResult6, result6);
        
        /**
         * Test case #7
         */
        System.out.println("calculateTimeOfDeath");
        double bodyTemp7 = 90;
        double roomTemp7 = 50;
        CaseControl instance7 = new CaseControl();
        String expResult7 = "\nVictim died at 1:00 AM";
        String result7 = instance7.calculateTimeOfDeath(bodyTemp7, roomTemp7);
        assertEquals(expResult7, result7);
        
        /**
         * Test case #8
         */
        System.out.println("calculateTimeOfDeath");
        double bodyTemp8 = 106;
        double roomTemp8 = 120;
        CaseControl instance8 = new CaseControl();
        String expResult8 = "\nVictim died at 1:00 AM";
        String result8 = instance8.calculateTimeOfDeath(bodyTemp8, roomTemp8);
        assertEquals(expResult8, result8);
    }
    
    /**
     * Test of suspectsAlibi method, of class CaseControl.
     */
    @Test
    public void testSuspectsAlibi() {
        System.out.println("suspectsAlibi");
        int timeSinceDeath = 4;
        int speedOfTravel = 3;
        CaseControl instance = new CaseControl();
        boolean expResult = true;
        boolean result = instance.isPersonASuspect(timeSinceDeath, speedOfTravel);
        assertEquals(expResult, result);
        
        
        /****
         * test case #2
         */
        
         System.out.println("suspectsAlibi");
        int timeSinceDeath2 = 2;
        int speedOfTravel2 = 4;
        CaseControl instance2 = new CaseControl();
        boolean expResult2 = false;
        boolean result2 = instance2.isPersonASuspect(timeSinceDeath2, speedOfTravel2);
        assertEquals(expResult2, result2);
        
        
        /****
         * test case #3
         */
        
         System.out.println("suspectsAlibi");
        int timeSinceDeath3 = 1;
        int speedOfTravel3 = 5;
        CaseControl instance3 = new CaseControl();
        boolean expResult3 = false;
        boolean result3 = instance3.isPersonASuspect(timeSinceDeath3, speedOfTravel3);
        assertEquals(expResult3, result3);
        
        /***
         * test case #4
         */
        
        System.out.println("suspectsAlibi");
        int timeSinceDeath4 = 2;
        int speedOfTravel4 = 3;
        CaseControl instance4 = new CaseControl();
        boolean expResult4 = true;
        boolean result4 = instance4.isPersonASuspect(timeSinceDeath4, speedOfTravel4);
        assertEquals(expResult4, result4);
        
        /***
         * test case #5
         */
        
         System.out.println("suspectsAlibi");
        int timeSinceDeath5 = 0;
        int speedOfTravel5 = 2;
        CaseControl instance5 = new CaseControl();
        boolean expResult5 = true;
        boolean result5 = instance5.isPersonASuspect(timeSinceDeath5, speedOfTravel5);
        assertEquals(expResult5, result5);
        
        /**
         * test case #6
         */
         System.out.println("suspectsAlibi");
        int timeSinceDeath6 = 2;
        int speedOfTravel6 = 3;
        CaseControl instance6 = new CaseControl();
        boolean expResult6 = true;
        boolean result6 = instance6.isPersonASuspect(timeSinceDeath6, speedOfTravel6);
        assertEquals(expResult6, result6);
        
        /***
         * test case #7
         */
        
         System.out.println("suspectsAlibi");
        int timeSinceDeath7 = 9;
        int speedOfTravel7 = 4;
        CaseControl instance7 = new CaseControl();
        boolean expResult7 = false;
        boolean result7 = instance7.isPersonASuspect(timeSinceDeath7, speedOfTravel7);
        assertEquals(expResult7, result7);
        
        /***
         * test case #8
         */
        
         System.out.println("suspectsAlibi");
        int timeSinceDeath8 = 0;
        int speedOfTravel8 = 0;
        CaseControl instance8 = new CaseControl();
        boolean expResult8 = true;
        boolean result8 = instance8.isPersonASuspect(timeSinceDeath8, speedOfTravel8);
        assertEquals(expResult8, result8);
    
    }
}
