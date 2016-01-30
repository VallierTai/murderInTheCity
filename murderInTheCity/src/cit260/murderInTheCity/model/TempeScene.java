/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Tai
 */
public class TempeScene extends Location implements Serializable {
    private List<Item> evidenceList;

    public TempeScene() {
    }
   
    public List<Item> getEvidenceList() {
        return evidenceList;
    }

    public void setEvidenceList(List<Item> evidenceList) {
        this.evidenceList = evidenceList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.evidenceList);
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
        final TempeScene other = (TempeScene) obj;
        if (!Objects.equals(this.evidenceList, other.evidenceList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TempeScene{evidenceList=" + evidenceList + '}';
    }
}
