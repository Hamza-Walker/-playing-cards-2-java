package com.codecool;

import com.codecool.model.Deck;
import com.codecool.service.*;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        CardGenerator cardGenerator = new CardGeneratorImpl(logger);

        DeckBuilder frenchDeckBuilder = new FrenchDeckBuilder((CardGeneratorImpl) cardGenerator);
        DeckBuilder germanDeckBuilder = new GermanDeckBuilder(cardGenerator);

        List<Deck> decks = buildDecks(new DeckBuilder[]{frenchDeckBuilder, germanDeckBuilder});

        printCardCounts(decks);
    }

    private static List<Deck> buildDecks(DeckBuilder[] builders) {
        List<Deck> decks = new ArrayList<>();
        for (DeckBuilder builder : builders) {
            decks.add(builder.createDeck());
        }
        return decks;
    }

    private static void printCardCounts(List<Deck> decks) {
        for (Deck deck : decks) {
            System.out.println("Card count: " + deck.getCardCount());
        }
    }
}
