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
 * @author Brad Bastian
 */
public class Map implements Serializable {

    private Location playerLocation;
    private List<Location> cityList;
    private int rowCount;
    private int columnCount;

    public Location getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(Location playerLocation) {
        this.playerLocation = playerLocation;
    }

    public List<Location> getCityList() {
        return cityList;
    }

    public void setCityList(List<Location> cityList) {
        this.cityList = cityList;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public Map() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.playerLocation);
        hash = 67 * hash + Objects.hashCode(this.cityList);
        hash = 67 * hash + this.rowCount;
        hash = 67 * hash + this.columnCount;
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (!Objects.equals(this.playerLocation, other.playerLocation)) {
            return false;
        }
        if (!Objects.equals(this.cityList, other.cityList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "playerLocation=" + playerLocation + ", cityList=" + cityList + ", rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }
}
