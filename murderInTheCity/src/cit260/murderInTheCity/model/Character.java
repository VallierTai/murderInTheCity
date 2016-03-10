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
 * @author Tai
 */
public enum Character implements Serializable {

    tempeSuspect1("Jeremy is Ashley's ex-boyfriend who plays baseball at ASU."),
    tempeSuspect2("Trevor is Ashley's boyfriend"),
    tempeSuspect3("Lindsey is Ashley's classmate"),
    tempeVictim("She was a college student at ASU.");

    private final String description;

    Character(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
