/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.model;

import cit260.murderInTheCity.control.CharacterControl.Victims;
import java.io.Serializable;
import java.util.Objects;
import cit260.murderInTheCity.model.Character;
import java.util.ArrayList;

/**
 *
 * @author Brad Bastian
 */
public class Case implements Serializable {

    private String name;
    private String description;
    private Character victim;
    private ArrayList<Character> suspects;
    private ArrayList<Item> murderWeapons;
    private ArrayList<Item> evidence;

    public Case(String name, String description, Character victim) {
        this.name = name;
        this.description = description;
        this.victim = victim;
        this.suspects = new ArrayList<Character>();
        this.murderWeapons = new ArrayList<Item>();
        this.evidence = new ArrayList<Item>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Character getVictim() {
        return victim;
    }

    public void setVictim(Character victim) {
        this.victim = victim;
    }

    public ArrayList<Character> getSuspects() {
        return suspects;
    }

    public void setSuspect(Character suspect) {
        this.suspects.add(suspect);
    }

    public ArrayList<Item> getMurderWeapons() {
        return murderWeapons;
    }

    public void setMurderWeapon(Item murderWeapon) {
        this.murderWeapons.add(murderWeapon);
    }

    public ArrayList<Item> getEvidence() {
        return evidence;
    }

    public void setEvidence(Item evidence) {
        this.evidence.add(evidence);
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + Objects.hashCode(this.victim);
        hash = 89 * hash + Objects.hashCode(this.suspects);
        hash = 89 * hash + Objects.hashCode(this.murderWeapons);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Case other = (Case) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.victim, other.victim)) {
            return false;
        }
        if (!Objects.equals(this.suspects, other.suspects)) {
            return false;
        }
        if (!Objects.equals(this.murderWeapons, other.murderWeapons)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Case{" + "name=" + name + ", description=" + description + ", victim=" + victim + ", suspect=" + suspects + ", murderWeapon=" + murderWeapons + '}';
    }
}
