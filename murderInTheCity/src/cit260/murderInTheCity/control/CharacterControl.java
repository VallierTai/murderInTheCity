/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.control;

import cit260.murderInTheCity.model.Character;

/**
 *
 * @author Brad Bastian
 */
public class CharacterControl {

    public enum Suspects {
        tempeSuspect1("Jeremy", "He is Ashley's ex-boyfriend who plays baseball at ASU."),
        tempeSuspect2("Trevor", "He is Ashley's boyfriend"),
        tempeSuspect3("Lindsey", "She is Ashley's classmate");

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
        TempeVictim("Ashley", "She was a college student at ASU.");

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

    public static Character[] createSuspectList() {

        // created array(list) of suspects
        Character[] suspects = new Character[3];

        Character suspect1 = new Character();
        suspect1.setName("?");
        suspect1.setDescription("?");
        suspects[Suspects.tempeSuspect1.ordinal()] = suspect1;

        Character suspect2 = new Character();
        suspect2.setName("?");
        suspect2.setDescription("?");
        suspects[Suspects.tempeSuspect2.ordinal()] = suspect2;

        Character suspect3 = new Character();
        suspect3.setName("?");
        suspect3.setDescription("?");
        suspects[Suspects.tempeSuspect3.ordinal()] = suspect3;

        return suspects;
    }

    public static Character[] createTempeVictim() {

        // created array(list) of victims
        Character[] victims = new Character[1];

        Character victim1 = new Character();
        victim1.setName("?");
        victim1.setDescription("?");
        victims[Victims.TempeVictim.ordinal()] = victim1;

        return victims;
    }

}
