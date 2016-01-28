/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murderinthecity;

import cit260.murderInTheCity.model.Location;

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
        location.setDescription("This is a default location");
        location.setDoesEvidenceExistHere(true);
        System.out.println(location.toString());
        
    }
    
}
