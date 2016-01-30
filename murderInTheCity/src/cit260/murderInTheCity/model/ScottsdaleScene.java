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
public class ScottsdaleScene implements Serializable{
    private String crimeDescription;
    private String evidenceList;

    public ScottsdaleScene() {
    }
    
    

    public String getCrimeDescription() {
        return crimeDescription;
    }

    public void setCrimeDescription(String crimeDescription) {
        this.crimeDescription = crimeDescription;
    }

    public String getEvidenceList() {
        return evidenceList;
    }

    public void setEvidenceList(String evidenceList) {
        this.evidenceList = evidenceList;
        
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.crimeDescription);
        hash = 97 * hash + Objects.hashCode(this.evidenceList);
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
        final ScottsdaleScene other = (ScottsdaleScene) obj;
        if (!Objects.equals(this.crimeDescription, other.crimeDescription)) {
            return false;
        }
        if (!Objects.equals(this.evidenceList, other.evidenceList)) {
            return false;
        }
        return true;
        
        
    }

    @Override
    public String toString() {
        return "ScottsdaleScene{" + "crimeDescription=" + crimeDescription + ", evidenceList=" + evidenceList + '}';
    }
    
    
    
    
    
}
