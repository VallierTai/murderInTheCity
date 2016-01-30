/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murderinthecity;

import cit260.murderInTheCity.model.Case;
import cit260.murderInTheCity.model.Character;
import cit260.murderInTheCity.model.Game;
import cit260.murderInTheCity.model.Item;
import cit260.murderInTheCity.model.Location;
import cit260.murderInTheCity.model.Map;
import cit260.murderInTheCity.model.PhoenixScene;
import cit260.murderInTheCity.model.Player;
import cit260.murderInTheCity.model.ScottsdaleScene;
import cit260.murderInTheCity.model.TempeScene;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tai
 */
public class MurderInTheCity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Location location = new Location();
        location.setDescription("You are in Phoenix, Arizona");
        System.out.println(location.toString());
        
        Game game = new Game();
        game.setIntroMessage("Welcome to Murder In The City");
        System.out.println(game.toString());
        
        Item murderWeapon = new Item();
        murderWeapon.setName("Bloody knife");
        murderWeapon.setDescription("Knife used to kill victim");
        murderWeapon.setIsEvidence(true);
        System.out.println(murderWeapon.toString());
        
        Item evidence1 = new Item();
        evidence1.setName("fingerprint");
        evidence1.setDescription("Fingerprint from bloody knife");
        evidence1.setIsEvidence(true);
        System.out.println(evidence1.toString());
        
        Item evidence2 = new Item();
        evidence2.setName("shell casing");
        evidence2.setDescription("9mm shell found at the scene of the crime");
        evidence2.setIsEvidence(true);
        System.out.println(evidence2.toString());
        
        Item evidence3 = new Item();
        evidence3.setName("threatening email");
        evidence3.setDescription("letter found on victim's computer");
        evidence3.setIsEvidence(true);
        System.out.println(evidence3.toString());
        
        List<Item> evidenceList = new ArrayList<>();
        evidenceList.add(evidence1);
        evidenceList.add(evidence2);
        evidenceList.add(evidence3);
        
        Player player = new Player();
        player.setInventory(murderWeapon);
        player.setName("Brad");
        player.setDescription("New detective in Phoenix");
        player.setSex("Male");
        System.out.println(player.toString());
        
        PhoenixScene phoenix = new PhoenixScene();
        phoenix.setEvidenceList(evidenceList);
        phoenix.setDescription("Phoenix, Arizona");
        System.out.println(phoenix.toString());
        
        ScottsdaleScene scottsdale = new ScottsdaleScene();
        scottsdale.setEvidenceList (evidenceList);
        scottsdale.setDescription("Scottsdale, Arizona");
        System.out.println(scottsdale.toString());
        
        TempeScene tempe = new TempeScene ();
        tempe.setEvidenceList(evidenceList);
        tempe.setDescription("Tempe, Arizona");
        System.out.println(tempe.toString());
        
        Character tempeVictim = new Character();
        tempeVictim.setDescription("Tempe victim");
        tempeVictim.setSex("Male");
        tempeVictim.setName("John Doe");
        System.out.println(tempeVictim.toString());
        
        Character tempeSuspect = new Character();
        tempeSuspect.setName("Susan");
        tempeSuspect.setDescription("She was John's wife");
        tempeSuspect.setSex("Female");
        System.out.println(tempeSuspect.toString());
        
        Case caseOne = new Case();
        caseOne.setName("Case of the Scottsdale scandal");
        caseOne.setDescription("Scottsdale scandal description");
        caseOne.setVictim(tempeVictim);
        caseOne.setSuspect(tempeSuspect);
        caseOne.setMurderWeapon(murderWeapon);
        System.out.println(caseOne.toString());
        
        List<Location> locations = new ArrayList<>();
        locations.add(phoenix);
        locations.add(tempe);
        locations.add(scottsdale);
        
        Map phoenixMap = new Map();
        phoenixMap.setPlayerLocation(location);
        phoenixMap.setRowCount(10);
        phoenixMap.setColumnCount(10);
        phoenixMap.setCityList(locations);
        System.out.println(phoenixMap.toString());
    }
}
