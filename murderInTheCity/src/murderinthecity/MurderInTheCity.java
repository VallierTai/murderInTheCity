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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tai
 */
public class MurderInTheCity {

    private static Game currentGame = null;
    private static Player player = null;

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        try {
            //create StartProgramView and start the program
        
        startProgramView.display();
        } catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
    }
}
