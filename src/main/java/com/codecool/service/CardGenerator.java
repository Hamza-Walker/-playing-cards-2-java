package com.codecool.service;

import com.codecool.model.*;

import java.util.ArrayList;

public class CardGenerator {
    public ArrayList<Card> generateFrenchDeck() {
        ArrayList<Card> deck = new ArrayList<>();
        generateNumberedCards(deck);
        generateCourtCards(deck);
        return deck;
    }

    public ArrayList<Card> generateGermanDeck() {
        ArrayList<Card> deck = new ArrayList<>();
        generateGermanNumberedCards(deck);
        generateGermanCourtCards(deck);
        return deck;
    }

    private void generateNumberedCards(ArrayList<Card> deck) {
        for (Suit suit : Suit.values()) {
            for (int number = 2; number <= 10; number++) {
                Card card = new Card(Symbol.NUMBER(number), suit);
                deck.add(card);
            }
        }
    }

    private void generateCourtCards(ArrayList<Card> deck) {
        for (Suit suit : Suit.values()) {
            Symbol[] courtSymbols = {Symbol.JACK, Symbol.QUEEN, Symbol.KING, Symbol.ACE};

            for (Symbol courtSymbol : courtSymbols) {
                Card card = new Card(courtSymbol, suit);
                deck.add(card);
            }
        }
    }

    private void generateGermanNumberedCards(ArrayList<Card> deck) {
        for (GermanSuit suit : GermanSuit.values()) {
            for (int number = 7; number <= 10; number++) {
                Card card = new Card(GermanSymbol.NUMBER(number), suit);
                deck.add(card);
            }
        }
    }

    private void generateGermanCourtCards(ArrayList<Card> deck) {
        GermanSuit[] germanSuits = {GermanSuit.ACORNS, GermanSuit.LEAVES, GermanSuit.HEARTS, GermanSuit.BELLS};
        GermanSymbol[] germanCourtSymbols = {GermanSymbol.UNTER, GermanSymbol.OBER, GermanSymbol.KING, GermanSymbol.ACE};

        for (GermanSuit suit : germanSuits) {
            for (GermanSymbol courtSymbol : germanCourtSymbols) {
                Card card = new Card(courtSymbol, suit);
                deck.add(card);
            }
        }
    }
}
