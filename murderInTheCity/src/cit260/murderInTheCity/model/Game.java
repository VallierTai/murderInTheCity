/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.model;

import cit260.murderInTheCity.control.CharacterControl.Victims;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Brad Bastian
 */
public class Game implements Serializable {

    private Player player;
    private Case[] cases;
    private Map[] maps;
    private ArrayList<Item> evidence;
    private ArrayList<Character> suspects;
    private ArrayList<Item> weapons;
    private Character[] victims;

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

    public ArrayList<Item> getEvidence() {
        return evidence;
    }

    public void setEvidence(ArrayList<Item> evidence) {
        this.evidence = evidence;
    }

    public ArrayList<Character> getSuspects() {
        return suspects;
    }

    public void setSuspects(ArrayList<Character> suspects) {
        this.suspects = suspects;
    }

    public ArrayList<Item> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Item> weapons) {
        this.weapons = weapons;
    }

    public Character[] getVictims() {
        return victims;
    }

    public void setVictims(Character[] victims) {
        this.victims = victims;
    }

}
