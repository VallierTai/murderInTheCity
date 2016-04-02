/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.control;

import cit260.murderInTheCity.model.Item;
import cit260.murderInTheCity.model.Location;
import cit260.murderInTheCity.model.Map;
import java.util.concurrent.ThreadLocalRandom;
import murderinthecity.MurderInTheCity;

import cit260.murderInTheCity.model.Character;
import cit260.murderInTheCity.model.Player;

/**
 *
 * @author Brad Bastian
 */
public class MapControl {

    static void initializeMap(Map map) {
        // initialize map locations
        Location[][] tempeMapLocations = new Location[7][7];
        for (int i = 0; i < tempeMapLocations.length; i++) {
            for (int j = 0; j < tempeMapLocations.length; j++) {
                tempeMapLocations[i][j] = new Location();
            }
        }

        // set player location on the map
        Player player = MurderInTheCity.getCurrentGame().getPlayer();
        int playerPositionX = ThreadLocalRandom.current().nextInt(0, 7);
        int playerPositionY = ThreadLocalRandom.current().nextInt(0, 7);
        tempeMapLocations[playerPositionX][playerPositionY].setPlayer(player);

        // set victim on the map
        Character[] victims = MurderInTheCity.getCurrentGame().getVictims();
        for (Character victim : victims) {
            victim.setX(ThreadLocalRandom.current().nextInt(0, 7));
            victim.setY(ThreadLocalRandom.current().nextInt(0, 7));
            tempeMapLocations[victim.getX()][victim.getY()].setVictim(victim);
        }
        
        // set evidence on the map
        Item[] evidence = MurderInTheCity.getCurrentGame().getEvidence();
        for (Item e : evidence) {
            e.setX(ThreadLocalRandom.current().nextInt(0, 7));
            e.setY(ThreadLocalRandom.current().nextInt(0, 7));
            tempeMapLocations[e.getX()][e.getY()].setEvidence(e);
        }

        // set suspects on the map
        Character[] suspects = MurderInTheCity.getCurrentGame().getSuspects();
        for (Character suspect : suspects) {
            suspect.setX(ThreadLocalRandom.current().nextInt(0, 7));
            suspect.setY(ThreadLocalRandom.current().nextInt(0, 7));
            tempeMapLocations[suspect.getX()][suspect.getY()].setSuspect(suspect);
        }
        
        // set weapons on the map
        Item[] weapons = MurderInTheCity.getCurrentGame().getWeapons();
        for (Item weapon : weapons) {
            weapon.setX(ThreadLocalRandom.current().nextInt(0, 7));
            weapon.setY(ThreadLocalRandom.current().nextInt(0, 7));
            tempeMapLocations[weapon.getX()][weapon.getY()].setMurderWeapon(weapon);
        }
        
        map.setLocations(tempeMapLocations);
    }

    public static void showMap() {
        Location block;
        Map[] maps = MurderInTheCity.getCurrentGame().getMaps();
        Map tempeMap = maps[0];
        Location[][] tempeMapLocations = tempeMap.getLocations();

        System.out.println("\n" + tempeMap.getName() + "\n");

        char alphabet = 'A';
        for (int c = 0; c < tempeMap.getColumnCount(); c++) {
            System.out.print("\t" + alphabet);
            alphabet++;
        }

        for (int i = 0; i < tempeMap.getRowCount(); i++) {
            System.out.println("\n--------------------------------------------"
                    + "----------------");
            System.out.print(i + 1);

            for (int j = 0; j < tempeMap.getColumnCount(); j++) {
                System.out.print("   |");
                block = tempeMapLocations[i][j];

                if (block.getVisited()) {
                    System.out.print("\tX");
                } else if (block.getPlayer() != null) {
                    System.out.print("\tP");
                } else if (block.getEvidence() != null) {
                    System.out.print("\tE");
                } else if (block.getSuspect() != null) {
                    System.out.print("\tS");
                } else if (block.getVictim() != null) {
                    System.out.print("\tV");
                } else if (block.getMurderWeapon() != null) {
                    System.out.print("\tW");
                } else {
                    System.out.print("\t*");
                }
            }
            System.out.print("  |");
        }
        System.out.println("\n---------------------------------------------"
                + "---------------");
    }

}
