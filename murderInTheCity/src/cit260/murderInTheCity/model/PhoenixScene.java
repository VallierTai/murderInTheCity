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
public class PhoenixScene extends Location implements Serializable
{
    private List<Item> evidenceList;

    public PhoenixScene() {
    }

    public List<Item> getEvidenceList() {
        return evidenceList;
    }

    public void setEvidenceList(List<Item> evidenceList) {
        this.evidenceList = evidenceList;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.evidenceList);
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
        final PhoenixScene other = (PhoenixScene) obj;
        if (!Objects.equals(this.evidenceList, other.evidenceList)) {
            return false;
        }
        return true;  
    }

    @Override
    public String toString() {
        return "PhoenixScene{evidenceList=" + evidenceList + '}';
    }
}
