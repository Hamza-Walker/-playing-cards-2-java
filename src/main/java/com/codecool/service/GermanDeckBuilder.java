package com.codecool.service;

import com.codecool.model.Card;
import com.codecool.model.Deck;

import java.util.List;

public class GermanDeckBuilder implements DeckBuilder {
    private static final int[] NUMBERS = {7, 8, 9, 10};
    private static final String[] SYMBOLS = {"Unter", "Ober", "King", "Ace"};
    private static final String[] SUITS = {"Acorns", "Leaves", "Hearts", "Bells"};

    private final CardGenerator cardGenerator;

    public GermanDeckBuilder(CardGenerator cardGenerator) {
        this.cardGenerator = cardGenerator;
    }

    public Deck createDeck() {
        List<Card> cards = cardGenerator.generate(NUMBERS, SYMBOLS, SUITS);
        return new Deck(cards);
    }
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        CardGeneratorImpl cardGenerator = new CardGeneratorImpl(logger);
        GermanDeckBuilder deckBuilder = new GermanDeckBuilder(cardGenerator);
        Deck deck = deckBuilder.createDeck();
        print(deck.toString());
    }

    public static <T> void print(T item) {
        System.out.println(item);
    }

    @Override
    public Deck CreateDeck() {
        return null;
    }
}
