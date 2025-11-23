/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;

/**
 *
 * @author Maryam Nasir
 */
public class UnoCard extends Card {

    private final UnoColor color;
    private final UnoValue value;

    public UnoCard(UnoColor color, UnoValue value) {
        this.color = color;
        this.value = value;
    }

    public UnoColor getColor() {
        return color;
    }

    public UnoValue getValue() {
        return value;
    }

    /**
     * Check if this card can be legally played on top of the given card.
     */
    public boolean matches(UnoCard top) {
        // Wild always matches
        if (this.color == UnoColor.WILD) {
            return true;
        }

        // Colors match
        if (this.color == top.color) {
            return true;
        }
        // Values match

        return this.value == top.value;
    }

    @Override
    public String toString() {
        return color + " " + value;
    }
}