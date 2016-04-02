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

/**
 *
 * @author Brad Bastian
 */
public class Case implements Serializable {

    private String name;
    private String description;
    private Character victim;
    private Character[] suspects;
    private Item[] murderWeapons;

    public Case(String name, String description, Character victim) {
        this.name = name;
        this.description = description;
        this.victim = victim;
        this.suspects = new Character[5];
        this.murderWeapons = new Item[4];
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

    public Character[] getSuspects() {
        return suspects;
    }

    public void setSuspects(Character suspect) {
        this.suspects = suspects;
    }

    public Item[] getMurderWeapons() {
        return murderWeapons;
    }

    public void setMurderWeapons(Item murderWeapon) {
        this.murderWeapons = murderWeapons;
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
