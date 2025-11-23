/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.List;

public class UnoDeck extends GroupOfCards {

    public UnoDeck() {
        super(108);
        buildDeck();
        shuffle();
    }

    private void buildDeck() {

        List<Card> cards = getCards();

        UnoColor[] colors = {
            UnoColor.RED, UnoColor.YELLOW, UnoColor.GREEN, UnoColor.BLUE
        };

        // One ZERO per color
        for (UnoColor color : colors) {
            cards.add(new UnoCard(color, UnoValue.ZERO));
        }

        // Two of 1–9 + action cards
        UnoValue[] doubles = {
            UnoValue.ONE, UnoValue.TWO, UnoValue.THREE, UnoValue.FOUR, UnoValue.FIVE,
            UnoValue.SIX, UnoValue.SEVEN, UnoValue.EIGHT, UnoValue.NINE,
            UnoValue.SKIP, UnoValue.REVERSE, UnoValue.DRAW_TWO
        };

        for (UnoColor color : colors) {
            for (UnoValue v : doubles) {
                cards.add(new UnoCard(color, v));
                cards.add(new UnoCard(color, v)); // second copy
            }
        }

        // 4 Wild + 4 Wild Draw Four
        for (int i = 0; i < 4; i++) {
            cards.add(new UnoCard(UnoColor.WILD, UnoValue.WILD));
            cards.add(new UnoCard(UnoColor.WILD, UnoValue.WILD_DRAW_FOUR));
        }
    }

    public UnoCard drawCard() {
        if (!getCards().isEmpty()) {
            return (UnoCard) getCards().remove(0);
        }
        return null;
    }
}
