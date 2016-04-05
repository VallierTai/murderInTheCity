/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.view;

import java.io.FileWriter;
import java.io.IOException;
import murderinthecity.MurderInTheCity;

/**
 *
 * @author Brad Bastian
 */
public class savePlayersName {

    public static void saveName() throws IOException {
        FileWriter outFile = null;

        String fileLocation = "playersName.txt";

        try {
            outFile = new FileWriter(fileLocation);

            outFile.write(MurderInTheCity.getPlayer().getName());
            outFile.flush();
        } catch (IOException ex) {
            System.out.println("Error saving Players name to file");
        } finally {
            if (outFile != null) {
                outFile.close();
            }
        }

    }
}
