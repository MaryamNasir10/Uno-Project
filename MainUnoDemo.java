/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ca.sheridancollege.project;

import ca.sheridancollege.project.UnoGame;
import ca.sheridancollege.project.UnoPlayer;

/**
 *
 * @author Maryam nasir
 */
public class MainUnoDemo {

    public static void main(String[] args) {

        UnoGame game = new UnoGame("UNO Demo");

        game.addPlayer(new UnoPlayer("Maryam"));
        game.addPlayer(new UnoPlayer("Ali"));

        game.play();
    }
}