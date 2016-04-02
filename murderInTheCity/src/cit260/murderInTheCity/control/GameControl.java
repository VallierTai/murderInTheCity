/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.control;

import cit260.murderInTheCity.control.CharacterControl.Victims;
import cit260.murderInTheCity.exceptions.GameControlException;
import cit260.murderInTheCity.model.Case;
import cit260.murderInTheCity.model.Game;
import cit260.murderInTheCity.model.Item;
import cit260.murderInTheCity.model.Map;
import cit260.murderInTheCity.model.Player;
import cit260.murderInTheCity.model.Character;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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
        try {
            // save the player
            MurderInTheCity.setPlayer(player);
        } catch (Exception ex) {
            ex.getMessage();
        }
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
        ArrayList<Item> evidence = ItemControl.createEvidenceList();
        game.setEvidence(evidence);

        ArrayList<Character> suspects = CharacterControl.createSuspectList();
        game.setSuspects(suspects);

        ArrayList<Item> possibleMurderWeapons = ItemControl.createPossibleMurderWeaponList();
        game.setWeapons(possibleMurderWeapons);

        // create new cases file
        Case[] cases = new Case[1];
        // save case in game
        Character[] victims = CharacterControl.createTempeVictim();
        game.setVictims(victims);
        String tempeCaseName = "Tempe case";
        String tempeCaseDescription = "\nAshley was a college student at ASU and "
                + "\non Friday night she went out with her friends to celebrate. "
                + "\nIt was warm that night, about 85 degrees. They went to the "
                + "\nlocal restaurant on Mill Ave. to celebrate after doing well "
                + "\non her final exams. Approximately between the hours of midnight "
                + "\nand 6 am Ashley was killed by a blunt object, when she was "
                + "\nstruck from behind. She was last seen at 11:30 pm leaving the "
                + "\nrestaurant alone, she took the light rail to the restaurant "
                + "\nand it was assumed that she took it home as well. When her "
                + "\nroommate woke up at 6am and noticed Ashley missing she called "
                + "\nthe police.\n"
                + "\n"
                + "We need you to find out what happened to Ashley once she left "
                + "\nthe restaurant! Who is her killer and what was the blunt object "
                + "\nthat was used to strike her from behind? When you have gathered "
                + "\nyour evidence and you are sure who the suspect is, you may "
                + "\nsolve the crime.\n"
                + "\n"
                + "Good Luck and watch your six!!";

        Case tempeCase = new Case(tempeCaseName, tempeCaseDescription,
                victims[Victims.TempeVictim.ordinal()]);
        cases[0] = tempeCase;
        game.setCase(cases);

        // create and initialize maps
        Map[] maps = new Map[1];

        // create tempeMap
        Map tempeMap = new Map("Map of Tempe", TEMPE_ROWS, TEMPE_COLUMNS);
        // add tempeMap to map collection
        maps[0] = tempeMap;
        // move characters to starting position in the map
        MapControl.initializeMap(tempeMap);
        // save map in game
        game.setMaps(maps);
    }

    public static ArrayList<Item> getEvidenceList() {
        Case[] cases = MurderInTheCity.getCurrentGame().getCases();
        ArrayList<Item> evidence = cases[0].getEvidence();

        return evidence;
    }

    public static ArrayList<Item> getWeaponsList() {
        Case[] cases = MurderInTheCity.getCurrentGame().getCases();
        ArrayList<Item> weapons = cases[0].getMurderWeapons();

        return weapons;
    }

    public static ArrayList<Character> getSuspectList() {
        Case[] cases = MurderInTheCity.getCurrentGame().getCases();
        ArrayList<Character> suspects = cases[0].getSuspects();

        return suspects;
    }

    public static void saveGame(Game game, String filepath)
            throws GameControlException {

        try (FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            // write the game object to the file
            output.writeObject(game);
        } catch (IOException e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filepath)
            throws GameControlException {

        Game game = null;

        try (FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream output = new ObjectInputStream(fips);

            // read the game object from file
            game = (Game) output.readObject();
        } catch (FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }

        // close the output file
        MurderInTheCity.setCurrentGame(game);
    }
}
