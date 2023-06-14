package com.codecool.model;

import java.util.Objects;

public class Card {
    private Symbol symbol;
    private Suit suit;
    private GermanSymbol germanSymbol;
    private GermanSuit germanSuit;
    private final String title;

    public Card(Symbol symbol, Suit suit) {
        this.symbol = symbol;
        this.suit = suit;
        this.title = createTitle();
    }

    public Card(GermanSymbol germanSymbol, GermanSuit germanSuit) {
        this.germanSymbol = germanSymbol;
        this.germanSuit = germanSuit;
        this.title = createTitle();
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public Suit getSuit() {
        return suit;
    }

    public GermanSymbol getGermanSymbol() {
        return germanSymbol;
    }

    public GermanSuit getGermanSuit() {
        return germanSuit;
    }

    private String getTitle() {
        return title;
    }

    private String createTitle() {
        if (germanSuit != null && germanSymbol != null) {
            return this.germanSymbol + " of " + this.germanSuit;
        } else {
            return this.symbol + " of " + this.suit;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card card)) return false;
        return symbol == card.symbol && suit == card.suit && germanSymbol == card.germanSymbol && germanSuit == card.germanSuit && Objects.equals(title, card.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, suit, germanSymbol, germanSuit, title);
    }

    @Override
    public String toString() {
        return title;
    }
}
