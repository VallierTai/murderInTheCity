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
import cit260.murderInTheCity.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tai
 */
public class MurderInTheCity {

    private static Game currentGame = null;
    private static Player player = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        MurderInTheCity.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        MurderInTheCity.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        MurderInTheCity.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        MurderInTheCity.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        MurderInTheCity.logFile = logFile;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // open character stream files for end user input and output
            MurderInTheCity.inFile
                    = new BufferedReader(new InputStreamReader(System.in));
            MurderInTheCity.outFile = new PrintWriter(System.out, true);

            // open log file
            String filePath = "log.txt";
            MurderInTheCity.logFile = new PrintWriter(filePath);

            //create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
        } catch (Throwable e) {
            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());

            e.printStackTrace();
        } finally {
            try {
                if (MurderInTheCity.inFile != null) {
                    MurderInTheCity.inFile.close();
                }
                if (MurderInTheCity.outFile != null) {
                    MurderInTheCity.outFile.close();
                }
                if (MurderInTheCity.logFile != null) {
                    MurderInTheCity.logFile.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(MurderInTheCity.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
