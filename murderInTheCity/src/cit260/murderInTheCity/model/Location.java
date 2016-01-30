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
 * @author Tai
 */
public class Location implements Serializable
{
  // class instance variables
  private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "description=" + description + '}';
    }
    
  
  

    
}
