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
 * @author Brad Bastian
 */
public class Game implements Serializable {

    private Player player;
    private Case[] cases;
    private Map[] maps;
    private Item[] evidence;
    private Character[] characters;

    public Game() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Case[] getCases() {
        return cases;
    }

    public void setCase(Case[] cases) {
        this.cases = cases;
    }

    public Map[] getMaps() {
        return maps;
    }

    public void setMaps(Map[] maps) {
        this.maps = maps;
    }

    public Item[] getEvidence() {
        return evidence;
    }

    public void setEvidence(Item[] evidence) {
        this.evidence = evidence;
    }

    public Character[] getCharacters() {
        return characters;
    }

    public void setCharacters(Character[] characters) {
        this.characters = characters;
    }

}
