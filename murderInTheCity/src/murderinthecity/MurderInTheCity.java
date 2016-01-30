/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murderinthecity;

import cit260.murderInTheCity.model.Case;
import cit260.murderInTheCity.model.Characters;
import cit260.murderInTheCity.model.Game;
import cit260.murderInTheCity.model.Item;
import cit260.murderInTheCity.model.Location;
import cit260.murderInTheCity.model.PhoenixScene;
import cit260.murderInTheCity.model.Player;
import cit260.murderInTheCity.model.ScottsdaleScene;
import cit260.murderInTheCity.model.TempeScene;

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
        location.setDoesEvidenceExistHere(true);
        System.out.println(location.toString());
        
        Game game = new Game();
        game.setIntroMessage("Welcome to Murder In The City");
        System.out.println(game.toString());
        
        Item murderWeapon = new Item();
        murderWeapon.setName("Bloody knife");
        murderWeapon.setDescription("Knife used to kill victim");
        murderWeapon.setIsEvidence(true);
        
        Player player = new Player();
        player.setInventory(murderWeapon);
        System.out.println(player.toString());
        
        Case caseOne = new Case();
        caseOne.setName("Case of the Scottsdale scandal");
        caseOne.setDescription("Scottsdale scandal description");
        
        PhoenixScene phoenix = new PhoenixScene();
        phoenix.setEvidenceList("fingerprint");
        phoenix.setCrimeDescription("homicide in hotel room ");
        
        ScottsdaleScene scottsdale = new ScottsdaleScene();
        scottsdale.setEvidenceList ("shell casing");
        scottsdale.setCrimeDescription (" bullet wound execution style");
        
        TempeScene tempe = new TempeScene ();
        tempe.setEvidenceList("threatening letter");
        tempe.setCrimeDescription("stabbing victim");
        
        Characters person = new Characters ();
        person.setDescription(null);
        person.setSex(null);
        person.setName(null);
        
        
        
       
        
    }
    
}
