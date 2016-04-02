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

    public static Item[] createEvidenceList() {

        // created array(list) of evidence
        Item[] evidence = new Item[5];

        Item evidence1 = new Item();
        evidence1.setName("evidence1");
        evidence1.setDescription("evidenceDescription1");
        evidence[Evidence.evidence1.ordinal()] = evidence1;

        Item evidence2 = new Item();
        evidence1.setName("evidence2");
        evidence1.setDescription("evidenceDescription2");
        evidence[Evidence.evidence2.ordinal()] = evidence2;

        Item evidence3 = new Item();
        evidence1.setName("evidence3");
        evidence1.setDescription("evidenceDescription3");
        evidence[Evidence.evidence3.ordinal()] = evidence3;

        Item evidence4 = new Item();
        evidence1.setName("evidence4");
        evidence1.setDescription("evidenceDescription4");
        evidence[Evidence.evidence4.ordinal()] = evidence4;

        Item evidence5 = new Item();
        evidence1.setName("evidence5");
        evidence1.setDescription("evidenceDescription5");
        evidence[Evidence.evidence5.ordinal()] = evidence5;

        return evidence;
    }

    public static Item[] createPossibleMurderWeaponList() {
        // created array(list) of evidence
        Item[] weapon = new Item[4];

        Item bat = new Item();
        bat.setName("weapon1");
        bat.setDescription("weaponDescription1");
        weapon[Weapons.Bat.ordinal()] = bat;

        Item trophy = new Item();
        trophy.setName("weapon2");
        trophy.setDescription("weaponDescription2");
        weapon[Weapons.Trophy.ordinal()] = trophy;

        Item lamp = new Item();
        lamp.setName("weapon3");
        lamp.setDescription("weaponDescription3");
        weapon[Weapons.Lamp.ordinal()] = lamp;

        Item hockeyStick = new Item();
        hockeyStick.setName("weapon4");
        hockeyStick.setDescription("weaponDescription4");
        weapon[Weapons.HockeyStick.ordinal()] = hockeyStick;

        return weapon;
    }

}
