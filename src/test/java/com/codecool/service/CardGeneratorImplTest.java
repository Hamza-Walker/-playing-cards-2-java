package com.codecool.service;

import com.codecool.model.Card;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CardGeneratorImplTest {
    @Test
    void generateCardsReturnsExpectedNumberOfCards() {
        // Arrange
        Logger logger = new ConsoleLogger();
        CardGeneratorImpl cardGenerator = new CardGeneratorImpl(logger);
        int[] numbers = {2, 3, 4};
        String[] symbols = {"J", "Q", "K"};
        String[] suits = {"Hearts", "Diamonds"};

        DeckDescriptor deckDescriptor = new DeckDescriptor(numbers, symbols, suits);
        int expectedCardCount = (deckDescriptor.numbers().length + deckDescriptor.symbols().length) * deckDescriptor.suits().length;

        // Act
        List<Card> cards = cardGenerator.generate(numbers, symbols, suits);

        // Assert
        assertEquals(expectedCardCount, cards.size());
    }
    @Test
    void generateCardsGeneratesExpectedCards() {
        // Arrange
        Logger logger = new ConsoleLogger();
        CardGeneratorImpl cardGenerator = new CardGeneratorImpl(logger);
        int[] numbers = { 2, 3, 4 };
        String[] symbols = { "J", "Q", "K" };
        String[] suits = { "Hearts", "Diamonds" };
        DeckDescriptor deckDescriptor = new DeckDescriptor(numbers, symbols, suits);

        List<Card> expectedCards = new ArrayList<>();
        expectedCards.add(new Card("2", "Hearts"));
        expectedCards.add(new Card("3", "Hearts"));
        expectedCards.add(new Card("4", "Hearts"));
        expectedCards.add(new Card("J", "Hearts"));
        expectedCards.add(new Card("Q", "Hearts"));
        expectedCards.add(new Card("K", "Hearts"));
        expectedCards.add(new Card("2", "Diamonds"));
        expectedCards.add(new Card("3", "Diamonds"));
        expectedCards.add(new Card("4", "Diamonds"));
        expectedCards.add(new Card("J", "Diamonds"));
        expectedCards.add(new Card("Q", "Diamonds"));
        expectedCards.add(new Card("K", "Diamonds"));

        // Act
        List<Card> cards = cardGenerator.generate(numbers, symbols, suits);

        // Assert
        assertEquals(expectedCards.size(), cards.size());
        assertTrue(expectedCards.containsAll(cards) && cards.containsAll(expectedCards));
    }
    }