/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maryam Nasir
 */

public class UnoPlayer extends Player {

    private final List<UnoCard> hand = new ArrayList<>();

    public UnoPlayer(String name) {
        super(name);
    }

    public List<UnoCard> getHand() {
        return hand;
    }

    public void drawCard(UnoDeck deck) {
        UnoCard drawn = deck.drawCard();
        if (drawn != null) hand.add(drawn);
    }

    public void showHand() {
        System.out.println(getName() + "'s hand: " + hand);
    }

    @Override
    public void play() {
        // Will be used later
    }
}
