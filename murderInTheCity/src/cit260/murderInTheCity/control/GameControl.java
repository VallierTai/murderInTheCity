/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.control;

import cit260.murderInTheCity.model.Case;
import cit260.murderInTheCity.model.Game;
import cit260.murderInTheCity.model.Item;
import cit260.murderInTheCity.model.Map;
import cit260.murderInTheCity.model.Player;
import murderinthecity.MurderInTheCity;

/**
 *
 * @author Brad Bastian
 */
public class GameControl {

    private static final int TEMPE_ROWS = 7;
    private static final int TEMPE_COLUMNS = 7;

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
        // create new game
        Game game = new Game();
        // save in MurderInTheCity
        MurderInTheCity.setCurrentGame(game);

        // save player in game
        game.setPlayer(player);

        // create the inventory list and save in the game
        Item[] evidence = ItemControl.createEvidenceList();
        game.setEvidence(evidence);

        // create new cases file
        Case[] cases = new Case[1];
        // save case in game
        game.setCase(cases);

        // create and initialize maps
        Map[] maps = MapControl.createMap[1];
        // save map in game
        game.setMaps(maps);

        // create tempeMap
        Map tempeMap = new Map(TEMPE_ROWS, TEMPE_COLUMNS);
        // add tempeMap to map collection
        maps[0] = tempeMap;
        // move characters to starting position in the map
        MapControl.moveCharactersToStartingLocation(tempeMap);
    }

    public static Item[] getEvidenceList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
