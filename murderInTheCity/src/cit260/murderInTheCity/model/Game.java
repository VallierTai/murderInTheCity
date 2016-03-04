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

    private String introMessage;

    public String getIntroMessage() {
        return introMessage;
    }

    public void setIntroMessage(String introMessage) {
        this.introMessage = introMessage;
    }

    public Game() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.introMessage);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.introMessage, other.introMessage)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "introMessage=" + introMessage + '}';
    }
}
