package com.codecool.model;

import java.util.Objects;

public class Card {
    private String symbol;
    private String suit;
    private final String title;

    public Card(String symbol, String suit) {
        this.symbol = symbol;
        this.suit = suit;
        this.title = createTitle();
    }

    public String getSymbol() {
        return symbol;
    }

    public String getSuit() {
        return suit;
    }

    private String getTitle() {
        return title;
    }

    private String createTitle() {
        return this.symbol + " of " + this.suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card card)) return false;
        return Objects.equals(symbol, card.symbol) && Objects.equals(suit, card.suit) && Objects.equals(title, card.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, suit, title);
    }

    @Override
    public String toString() {
        return title;
    }
}
