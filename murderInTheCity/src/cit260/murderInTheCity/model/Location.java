/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.model;

import cit260.murderInTheCity.control.CharacterControl.Victims;
import java.io.Serializable;

/**
 *
 * @author Tai
 */
public class Location implements Serializable {
    // class instance variables

    private int row;
    private int column;
    private boolean visited;
    private Player player;
    private Character victim;
    private Character suspect;
    private Item evidence;
    private Item murderWeapon;

    public Location() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
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

    public Item getEvidence() {
        return evidence;
    }

    public void setEvidence(Item evidence) {
        this.evidence = evidence;
    }

    public Item getMurderWeapon() {
        return murderWeapon;
    }

    public void setMurderWeapon(Item murderWeapon) {
        this.murderWeapon = murderWeapon;
    }
    

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.row;
        hash = 97 * hash + this.column;
        hash = 97 * hash + (this.visited ? 1 : 0);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        return true;
    }

}
