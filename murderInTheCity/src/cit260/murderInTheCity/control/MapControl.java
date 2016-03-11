/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.control;

import cit260.murderInTheCity.model.Map;

/**
 *
 * @author Brad Bastian
 */
public class MapControl {

    static Map[][] createMap;

    private static Map createMap(int rows, int columns) {
        // create the map
        Map map = new Map(rows, columns);

        return map;
    }

    static void moveCharactersToStartingLocation(Map map) {

    }

}
