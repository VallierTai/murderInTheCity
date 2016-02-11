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
 * Need to delete this line
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
        int expResult1 = 20;
        int result1 = instance1.calculateSearchRadius(speedOfTravel1, timeOfDeath1);
        assertEquals(expResult1, result1);
    
        /**
        * Test case #2
        */
        System.out.println("calculateSearchRadius");
        int speedOfTravel2 = 4;
        String timeOfDeath2 = "10:00 PM";
        CaseControl instance2 = new CaseControl();
        int expResult2 = -1;
        int result2 = instance2.calculateSearchRadius(speedOfTravel2, timeOfDeath2);
        assertEquals(expResult2, result2);
    
        /**
        * Test case #3
        */
        System.out.println("calculateSearchRadius");
        int speedOfTravel3 = 2;
        String timeOfDeath3 = "B";
        CaseControl instance3 = new CaseControl();
        int expResult3 = -1;
        int result3 = instance3.calculateSearchRadius(speedOfTravel3, timeOfDeath3);
        assertEquals(expResult3, result3);
    
        /**
        * Test case #4
        */
        System.out.println("calculateSearchRadius");
        int speedOfTravel4 = 15;
        String timeOfDeath4 = "3:00 AM";
        CaseControl instance4 = new CaseControl();
        int expResult4 = -1;
        int result4 = instance4.calculateSearchRadius(speedOfTravel4, timeOfDeath4);
        assertEquals(expResult4, result4);
    
        /**
        * Test case #5
        */
        System.out.println("calculateSearchRadius");
        int speedOfTravel5 = 5;
        String timeOfDeath5 = "1:00 AM";
        CaseControl instance5 = new CaseControl();
        int expResult5 = 25;
        int result5 = instance5.calculateSearchRadius(speedOfTravel5, timeOfDeath5);
        assertEquals(expResult5, result5);
    
        /**
        * Test case #6
        */
        System.out.println("calculateSearchRadius");
        int speedOfTravel6 = 0;
        String timeOfDeath6 = "5:00 AM";
        CaseControl instance6 = new CaseControl();
        int expResult6 = -1;
        int result6 = instance6.calculateSearchRadius(speedOfTravel6, timeOfDeath6);
        assertEquals(expResult6, result6);
    
        /**
        * Test case #7
        */
        System.out.println("calculateSearchRadius");
        int speedOfTravel7 = 1;
        String timeOfDeath7 = "5:00 AM";
        CaseControl instance7 = new CaseControl();
        int expResult7 = 1;
        int result7 = instance7.calculateSearchRadius(speedOfTravel7, timeOfDeath7);
        assertEquals(expResult7, result7);
    }
}
