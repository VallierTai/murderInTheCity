/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Brad Bastian
 */
public class Player extends Character implements Serializable {
    private Item inventory;

    public Item getInventory() {
        return inventory;
    }

    public void setInventory(Item inventory) {
        this.inventory = inventory;
    }

    public Player() {
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.inventory);
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "inventory=" + inventory + '}';
    }
}
