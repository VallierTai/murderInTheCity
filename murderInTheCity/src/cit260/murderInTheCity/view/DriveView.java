/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.murderInTheCity.view;

import cit260.murderInTheCity.model.Case;
import cit260.murderInTheCity.model.Location;
import cit260.murderInTheCity.model.Map;
import cit260.murderInTheCity.model.Player;
import murderinthecity.MurderInTheCity;

/**
 *
 * @author Brad Bastian
 */
public class DriveView extends View {

    public DriveView() {
        super("\n"
                + "\n--------------------------------------"
                + "\n| Drive Menu "
                + "\nN - North"
                + "\nS - South"
                + "\nE - East"
                + "\nW - West"
                + "\nQ - Return to Game Menu"
                + "\n======================================"
                + "\n\nPlease enter an option: ");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "N": // view city locations
                this.driveNorth();
                break;
            case "S": // evidence list
                this.driveSouth();
                break;
            case "E": // suspect list
                this.driveEast();
                break;
            case "W": // calculate time of death
                this.driveWest();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void driveNorth() {

        Map[] maps = MurderInTheCity.getCurrentGame().getMaps();
        Location[][] tempeLocations = maps[0].getLocations();
        Player player = MurderInTheCity.getPlayer();
        Location block = tempeLocations[player.getY()][player.getX()];
        Case[] cases = MurderInTheCity.getCurrentGame().getCases();
        Case tempeCase = cases[0];

        if (player.getY() != 0) {
            block.setIsPlayerHere(false);
            player.setY(player.getY() - 1);

            block.setVisited(true);
            block = tempeLocations[player.getY()][player.getX()];
            block.setIsPlayerHere(true);

            if (block.getEvidence() != null) {
                if (!block.getVisited()) {
                    tempeCase.setEvidence(block.getEvidence());
                    block.setVisited(true);
                    System.out.println("\nYou have just collected a piece of evidence"
                            + "\nName: " + block.getEvidence().getName()
                            + "\nDescription: " + block.getEvidence().getDescription());
                } else {
                    this.console.println("\nYou have already collected the evidence here");
                }
            } else if (block.getMurderWeapon() != null) {
                if (!block.getVisited()) {
                    tempeCase.setMurderWeapon(block.getMurderWeapon());
                    block.setVisited(true);
                    System.out.println("\nYou have just collected a weapon"
                            + "\nName: " + block.getMurderWeapon().getName()
                            + "\nDescription: " + block.getMurderWeapon().getDescription());
                } else {
                    this.console.println("\nYou have already collected the weapon here");
                }
            } else if (block.getSuspect() != null) {
                if (!block.getVisited()) {
                    tempeCase.setSuspect(block.getSuspect());
                    block.setVisited(true);
                    System.out.println("\nYou have just apprehended a suspect"
                            + "\nName: " + block.getSuspect().getName()
                            + "\nDescription: " + block.getSuspect().getDescription());
                } else {
                    this.console.println("\nYou have already apprehended the suspect here");
                }
            } else if (block.getVictim() != null) {
                System.out.println("\nYou have found the victim. "
                        + "\nThe body temperature is 95 degrees.");
            } else {
                System.out.println("\nYou drove North and found nothing");
            }
        } else {
            System.out.println("\nYou cannot drive North");
        }
    }

    private void driveSouth() {

        Map[] maps = MurderInTheCity.getCurrentGame().getMaps();
        Location[][] tempeLocations = maps[0].getLocations();
        Player player = MurderInTheCity.getPlayer();
        Location block = tempeLocations[player.getY()][player.getX()];
        Case[] cases = MurderInTheCity.getCurrentGame().getCases();
        Case tempeCase = cases[0];

        if (player.getY() != 6) {
            block.setIsPlayerHere(false);
            player.setY(player.getY() + 1);

            block.setVisited(true);
            block = tempeLocations[player.getY()][player.getX()];
            block.setIsPlayerHere(true);

            if (block.getEvidence() != null) {
                if (!block.getVisited()) {
                    tempeCase.setEvidence(block.getEvidence());
                    block.setVisited(true);
                    System.out.println("\nYou have just collected a piece of evidence"
                            + "\nName: " + block.getEvidence().getName()
                            + "\nDescription: " + block.getEvidence().getDescription());
                } else {
                    this.console.println("\nYou have already collected the evidence here");
                }
            } else if (block.getMurderWeapon() != null) {
                if (!block.getVisited()) {
                    tempeCase.setMurderWeapon(block.getMurderWeapon());
                    block.setVisited(true);
                    System.out.println("\nYou have just collected a weapon"
                            + "\nName: " + block.getMurderWeapon().getName()
                            + "\nDescription: " + block.getMurderWeapon().getDescription());
                } else {
                    this.console.println("\nYou have already collected the weapon here");
                }
            } else if (block.getSuspect() != null) {
                if (!block.getVisited()) {
                    tempeCase.setSuspect(block.getSuspect());
                    block.setVisited(true);
                    System.out.println("\nYou have just apprehended a suspect"
                            + "\nName: " + block.getSuspect().getName()
                            + "\nDescription: " + block.getSuspect().getDescription());
                } else {
                    this.console.println("\nYou have already apprehended the suspect here");
                }
            } else if (block.getVictim() != null) {
                System.out.println("\nYou have found the victim. "
                        + "\nThe body temperature is 95 degrees.");
            } else {
                System.out.println("\nYou drove South and found nothing");
            }
        } else {
            System.out.println("\nYou cannot drive South");
        }
    }

    private void driveEast() {

        Map[] maps = MurderInTheCity.getCurrentGame().getMaps();
        Location[][] tempeLocations = maps[0].getLocations();
        Player player = MurderInTheCity.getPlayer();
        Location block = tempeLocations[player.getY()][player.getX()];
        Case[] cases = MurderInTheCity.getCurrentGame().getCases();
        Case tempeCase = cases[0];

        if (player.getX() != 6) {
            block.setIsPlayerHere(false);
            player.setX(player.getX() + 1);

            block.setVisited(true);
            block = tempeLocations[player.getY()][player.getX()];
            block.setIsPlayerHere(true);

            if (block.getEvidence() != null) {
                if (!block.getVisited()) {
                    tempeCase.setEvidence(block.getEvidence());
                    block.setVisited(true);
                    System.out.println("\nYou have just collected a piece of evidence"
                            + "\nName: " + block.getEvidence().getName()
                            + "\nDescription: " + block.getEvidence().getDescription());
                } else {
                    this.console.println("\nYou have already collected the evidence here");
                }
            } else if (block.getMurderWeapon() != null) {
                if (!block.getVisited()) {
                    tempeCase.setMurderWeapon(block.getMurderWeapon());
                    block.setVisited(true);
                    System.out.println("\nYou have just collected a weapon"
                            + "\nName: " + block.getMurderWeapon().getName()
                            + "\nDescription: " + block.getMurderWeapon().getDescription());
                } else {
                    this.console.println("\nYou have already collected the weapon here");
                }
            } else if (block.getSuspect() != null) {
                if (!block.getVisited()) {
                    tempeCase.setSuspect(block.getSuspect());
                    block.setVisited(true);
                    System.out.println("\nYou have just apprehended a suspect"
                            + "\nName: " + block.getSuspect().getName()
                            + "\nDescription: " + block.getSuspect().getDescription());
                } else {
                    this.console.println("\nYou have already apprehended the suspect here");
                }
            } else if (block.getVictim() != null) {
                System.out.println("\nYou have found the victim. "
                        + "\nThe body temperature is 95 degrees.");
            } else {
                System.out.println("\nYou drove East and found nothing");
            }
        } else {
            System.out.println("\nYou cannot drive East");
        }
    }

    private void driveWest() {

        Map[] maps = MurderInTheCity.getCurrentGame().getMaps();
        Location[][] tempeLocations = maps[0].getLocations();
        Player player = MurderInTheCity.getPlayer();
        Location block = tempeLocations[player.getY()][player.getX()];
        Case[] cases = MurderInTheCity.getCurrentGame().getCases();
        Case tempeCase = cases[0];

        if (player.getX() != 0) {
            block.setIsPlayerHere(false);
            player.setX(player.getX() - 1);

            block.setVisited(true);
            block = tempeLocations[player.getY()][player.getX()];
            block.setIsPlayerHere(true);

            if (block.getEvidence() != null) {
                if (!block.getVisited()) {
                    tempeCase.setEvidence(block.getEvidence());
                    block.setVisited(true);
                    System.out.println("\nYou have just collected a piece of evidence"
                            + "\nName: " + block.getEvidence().getName()
                            + "\nDescription: " + block.getEvidence().getDescription());
                } else {
                    this.console.println("\nYou have already collected the evidence here");
                }
            } else if (block.getMurderWeapon() != null) {
                if (!block.getVisited()) {
                    tempeCase.setMurderWeapon(block.getMurderWeapon());
                    block.setVisited(true);
                    System.out.println("\nYou have just collected a weapon"
                            + "\nName: " + block.getMurderWeapon().getName()
                            + "\nDescription: " + block.getMurderWeapon().getDescription());
                } else {
                    this.console.println("\nYou have already collected the weapon here");
                }
            } else if (block.getSuspect() != null) {
                if (!block.getVisited()) {
                    tempeCase.setSuspect(block.getSuspect());
                    block.setVisited(true);
                    System.out.println("\nYou have just apprehended a suspect"
                            + "\nName: " + block.getSuspect().getName()
                            + "\nDescription: " + block.getSuspect().getDescription());
                } else {
                    this.console.println("\nYou have already apprehended the suspect here");
                }
            } else if (block.getVictim() != null) {
                System.out.println("\nYou have found the victim. "
                        + "\nThe body temperature is 95 degrees.");
            } else {
                System.out.println("\nYou drove West and found nothing");
            }
        } else {
            System.out.println("\nYou cannot drive West");
        }
    }
}
