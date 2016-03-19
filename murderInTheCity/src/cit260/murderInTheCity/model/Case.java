/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.model;

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
    private String searchRadius;
    private Character victim;
    private Character suspect;
    private Item murderWeapon;

    public Case() {
        this.name = "Tempe case";
        this.description = "tempe case description";
        this.searchRadius = null;
        this.victim = null;
        this.suspect = null;
        this.murderWeapon = null;
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

    public String getSearchRadius() {
        return searchRadius;
    }

    public void setSearchRadius(String searchRadius) {
        this.searchRadius = searchRadius;
    }

    public Character getVictim() {
        return victim;
    }

    public void setVictim(Character victim) {
        this.victim = victim;
    }

    public Character getSuspect() {
        return suspect;
    }

    public void setSuspect(Character suspect) {
        this.suspect = suspect;
    }

    public Item getMurderWeapon() {
        return murderWeapon;
    }

    public void setMurderWeapon(Item murderWeapon) {
        this.murderWeapon = murderWeapon;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + Objects.hashCode(this.searchRadius);
        hash = 89 * hash + Objects.hashCode(this.victim);
        hash = 89 * hash + Objects.hashCode(this.suspect);
        hash = 89 * hash + Objects.hashCode(this.murderWeapon);
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
        if (!Objects.equals(this.searchRadius, other.searchRadius)) {
            return false;
        }
        if (!Objects.equals(this.victim, other.victim)) {
            return false;
        }
        if (!Objects.equals(this.suspect, other.suspect)) {
            return false;
        }
        if (!Objects.equals(this.murderWeapon, other.murderWeapon)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Case{" + "name=" + name + ", description=" + description + ", searchRadius=" + searchRadius + ", victim=" + victim + ", suspect=" + suspect + ", murderWeapon=" + murderWeapon + '}';
    }
}
