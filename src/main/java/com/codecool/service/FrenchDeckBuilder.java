package com.codecool.service;

import com.codecool.model.Card;
import com.codecool.model.Deck;

import java.util.List;

public class FrenchDeckBuilder implements DeckBuilder {
    private static final int[] NUMBERS = {2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static final String[] SYMBOLS = {"Jack", "Queen", "King", "Ace"};
    private static final String[] SUITS = {"Clubs", "Spades", "Hearts", "Diamonds"};

    private final CardGenerator cardGenerator;

    public FrenchDeckBuilder(CardGeneratorImpl cardGenerator) {
        this.cardGenerator = cardGenerator;
    }

    public Deck createDeck() {
        List<Card> cards = cardGenerator.generate(NUMBERS, SYMBOLS, SUITS);
        return new Deck(cards);
    }
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();

        CardGeneratorImpl cardGenerator = new CardGeneratorImpl(logger);
        FrenchDeckBuilder deckBuilder = new FrenchDeckBuilder(cardGenerator);
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
