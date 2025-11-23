/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;

/**
 *
 * @author Maryam Nasir
 */

public class UnoGame extends Game {

    private final UnoDeck drawPile;
    private final UnoDiscardPile discardPile;

    public UnoGame(String name) {
        super(name);
        drawPile = new UnoDeck();
        discardPile = new UnoDiscardPile();
    }

    @Override
    public void play() {

        System.out.println("===== Starting UNO Game =====");

        if (getPlayers().size() < 2) {
            System.out.println("You need at least 2 players to start UNO.");
            return;
        }

        UnoPlayer p1 = (UnoPlayer) getPlayers().get(0);
        UnoPlayer p2 = (UnoPlayer) getPlayers().get(1);

        for (int i = 0; i < 5; i++) {
            p1.drawCard(drawPile);
            p2.drawCard(drawPile);
        }

        UnoCard first = drawPile.drawCard();
        discardPile.push(first);

        System.out.println("Top Card: " + discardPile.peek());
        p1.showHand();
        p2.showHand();
    }

    @Override
    public void declareWinner() {
        System.out.println("Winner declaration will be added later.");
    }
}
