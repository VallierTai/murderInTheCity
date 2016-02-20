/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.control;

import cit260.murderInTheCity.model.Player;
import murderinthecity.MurderInTheCity;

/**
 *
 * @author Brad Bastian
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        // save the player
        MurderInTheCity.setPlayer(player);
        
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("\n createNewGame function called");
    }
}
