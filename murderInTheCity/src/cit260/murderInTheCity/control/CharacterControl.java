/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.control;

import cit260.murderInTheCity.model.Character;
import java.util.ArrayList;

/**
 *
 * @author Brad Bastian
 */
public class CharacterControl {

    public enum Suspects {
        Jeremy("Jeremy", "He is Ashley's ex-boyfriend who plays baseball at ASU."),
        Ethan("Ethan", "He is Ashley's boyfriend who plays hockey"),
        Lindsey("Lindsey", "She is Ashley's classmate who is angry because Ashley"
                + "was dating Lindsey's ex-boyfriend");

        private final String name;
        private final String description;

        Suspects(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }
    }

    public enum Victims {
        TempeVictim("Ashley", "was a college student at ASU.");

        private final String name;
        private final String description;

        Victims(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }
    }

    public static ArrayList<Character> createSuspectList() {

        // created array(list) of suspects
        ArrayList<Character> suspects = new ArrayList<Character>();

        Character suspect1 = new Character();
        suspect1.setName(Suspects.Jeremy.name);
        suspect1.setDescription(Suspects.Jeremy.description);
        suspects.add(suspect1);

        Character suspect2 = new Character();
        suspect2.setName(Suspects.Ethan.name);
        suspect2.setDescription(Suspects.Ethan.description);
        suspects.add(suspect2);

        Character suspect3 = new Character();
        suspect3.setName(Suspects.Lindsey.name);
        suspect3.setDescription(Suspects.Lindsey.description);
        suspects.add(suspect3);

        return suspects;
    }

    public static Character[] createTempeVictim() {

        // created array(list) of victims
        Character[] victims = new Character[1];
        try {
            Character victim1 = new Character();
            victim1.setName(Victims.TempeVictim.getName());
            victim1.setDescription(Victims.TempeVictim.getDescription());
            victims[Victims.TempeVictim.ordinal()] = victim1;
        } catch (Exception e) {
            System.out.println("failure to create new character");
        }
        return victims;
    }
}
