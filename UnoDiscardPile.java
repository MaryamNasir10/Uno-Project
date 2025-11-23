/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.List;

public class UnoDiscardPile extends GroupOfCards {

    public UnoDiscardPile() {
        super(108);
    }

    public void push(UnoCard card) {
        getCards().add(card);
    }

    public UnoCard peek() {
        List<Card> cards = getCards();
        if (cards.isEmpty()) return null;
        return (UnoCard) cards.get(cards.size() - 1);
    }
}
