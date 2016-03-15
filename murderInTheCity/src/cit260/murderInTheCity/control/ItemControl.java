/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.control;

import cit260.murderInTheCity.model.Item;

/**
 *
 * @author Brad Bastian
 */
public class ItemControl {

    public static Item[] createEvidenceList() {

        // created array(list) of evidence
        Item[] evidence = new Item[6];

        Item evidence1 = new Item();
        evidence1.setName("?");
        evidence1.setDescription("?");
        evidence[Evidence.evidence1.ordinal()] = evidence1;

        Item evidence2 = new Item();
        evidence1.setName("?");
        evidence1.setDescription("?");
        evidence[Evidence.evidence2.ordinal()] = evidence2;

        Item evidence3 = new Item();
        evidence1.setName("?");
        evidence1.setDescription("?");
        evidence[Evidence.evidence3.ordinal()] = evidence3;

        Item evidence4 = new Item();
        evidence1.setName("?");
        evidence1.setDescription("?");
        evidence[Evidence.evidence4.ordinal()] = evidence4;

        Item evidence5 = new Item();
        evidence1.setName("?");
        evidence1.setDescription("?");
        evidence[Evidence.evidence5.ordinal()] = evidence5;

        Item murderWeapon = new Item();
        evidence1.setName("Murder weapon");
        evidence1.setDescription("?");
        evidence[Evidence.murderWeapon.ordinal()] = murderWeapon;

        return evidence;
    }

    public enum Evidence {
        evidence1,
        evidence2,
        evidence3,
        evidence4,
        evidence5,
        murderWeapon;
    }
    
    public static Item[] createPossibleMurderWeaponList() {
        // created array(list) of evidence
        Item[] weapon = new Item[4];

        Item bat = new Item();
        bat.setName("?");
        bat.setDescription("?");
        weapon[Weapons.Bat.ordinal()] = bat;

        Item trophy = new Item();
        trophy.setName("?");
        trophy.setDescription("?");
        weapon[Weapons.Trophy.ordinal()] = trophy;

        Item lamp = new Item();
        lamp.setName("?");
        lamp.setDescription("?");
        weapon[Weapons.Lamp.ordinal()] = lamp;

        Item hockeyStick = new Item();
        hockeyStick.setName("?");
        hockeyStick.setDescription("?");
        weapon[Weapons.HockeyStick.ordinal()] = hockeyStick;

        return weapon;
    }
    
    public enum Weapons {
        Bat,
        Trophy,
        Lamp,
        HockeyStick;
    }
}
