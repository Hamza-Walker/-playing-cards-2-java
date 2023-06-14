package com.codecool.service;

import com.codecool.model.Card;
import com.codecool.model.Suit;
import com.codecool.model.Symbol;

import java.util.ArrayList;

public class FrenchCardGenerator {
    private final static ArrayList<Card> deck = new ArrayList<>();
    public FrenchCardGenerator() {
        generateNumberedCards();
        generateCourtCards();
    }

    public static ArrayList<Card> getDeck() {
        return deck;
    }

    private void generateNumberedCards () {
        for (Suit suit : Suit.values()) {
            for (int number = 2; number <= 10; number++) {
                Card card = new Card(Symbol.NUMBER(number), suit);
                deck.add(card);
            }
        }
    }
    private void generateCourtCards () {
        for (Suit suit : Suit.values()) {
            Symbol[] courtSymbols = {Symbol.JACK, Symbol.QUEEN, Symbol.KING, Symbol.ACE};

            for (Symbol courtSymbol : courtSymbols) {
                Card card = new Card(courtSymbol, suit);
                deck.add(card);
            }
        }

    }
}
