/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.control;

import cit260.murderInTheCity.model.Item;
import java.util.ArrayList;

/**
 *
 * @author Brad Bastian
 */
public class ItemControl {

    public enum Evidence {
        evidence1,
        evidence2,
        evidence3,
        evidence4,
        evidence5;
    }

    public enum Weapons {
        Bat,
        Trophy,
        Lamp,
        HockeyStick;
    }

    public static ArrayList<Item> createEvidenceList() {

        // created array(list) of evidence
        ArrayList<Item> evidence = new ArrayList<Item>();

        Item evidence1 = new Item();
        evidence1.setName("Shoeprint");
        evidence1.setDescription("This shoeprint was found around the body and "
                + "\nmatches the baseball team shoes");
        evidence.add(evidence1);

        Item evidence2 = new Item();
        evidence2.setName("Torn piece of cloth from letter jacket");
        evidence2.setDescription("This piece of cloth was found in the victim's hand");
        evidence.add(evidence2);

        Item evidence3 = new Item();
        evidence3.setName("Strand of hair");
        evidence3.setDescription("Jason's hair found on victim's body");
        evidence.add(evidence3);

        Item evidence4 = new Item();
        evidence4.setName("DNA");
        evidence4.setDescription("DNA from under victim's fingernails. This is "
                + "\nJason's DNA");
        evidence.add(evidence4);

        Item evidence5 = new Item();
        evidence5.setName("Fingerprint");
        evidence5.setDescription("This is Jason's fingerprint on the bat with the "
                + "\nvictim's blood on it");
        evidence.add(evidence5);

        return evidence;
    }

    public static ArrayList<Item> createPossibleMurderWeaponList() {
        // created array(list) of evidence
        ArrayList<Item> weapons = new ArrayList<Item>();

        Item bat = new Item();
        bat.setName("Baseball bat");
        bat.setDescription("bat");
        weapons.add(bat);

        Item trophy = new Item();
        trophy.setName("Trophy");
        trophy.setDescription("trophy");
        weapons.add(trophy);

        Item lamp = new Item();
        lamp.setName("Lamp");
        lamp.setDescription("lamp");
        weapons.add(lamp);

        Item hockeyStick = new Item();
        hockeyStick.setName("Hockey stick");
        hockeyStick.setDescription("hockey stick");
        weapons.add(hockeyStick);

        return weapons;
    }

}
