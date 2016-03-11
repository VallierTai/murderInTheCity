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

    private int rowCount;
    private int columnCount;
    private Location[][] locations;

    public Map(int rows, int columns) {

        if (rows < 1 || columns < 1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }

        this.rowCount = rows;
        this.columnCount = columns;

        // create 2-D array for Location objects
        this.locations = new Location[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                // create and initialize new Location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);

                // assign the Location object to the current position in array
                locations[row][column] = location;
            }
        }
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

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + ", rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }
}
