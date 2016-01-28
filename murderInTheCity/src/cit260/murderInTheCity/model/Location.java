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
  private boolean doesEvidenceExistHere; 

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDoesEvidenceExistHere() {
        return doesEvidenceExistHere;
    }

    public void setDoesEvidenceExistHere(boolean doesEvidenceExistHere) {
        this.doesEvidenceExistHere = doesEvidenceExistHere;
        
        
    }

    public Location() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + (this.doesEvidenceExistHere ? 1 : 0);
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
        if (this.doesEvidenceExistHere != other.doesEvidenceExistHere) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "description=" + description + ", doesEvidenceExistHere=" + doesEvidenceExistHere + '}';
    }
    
  
  

    
}
