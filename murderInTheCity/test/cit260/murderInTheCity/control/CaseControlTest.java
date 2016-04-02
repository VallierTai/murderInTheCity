/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.control;

import cit260.murderInTheCity.model.Case;
import cit260.murderInTheCity.view.ErrorView;
import murderinthecity.MurderInTheCity;
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

}
