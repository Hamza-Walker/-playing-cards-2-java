package com.codecool.service;

import com.codecool.model.Card;
import com.codecool.model.Deck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GermanDeckBuilderTest {
    private CardGenerator cardGeneratorMock;
    private DeckDescriptor deckDescriptor;

    @BeforeEach
    void beforeEach() {
        cardGeneratorMock = mock(CardGenerator.class);
        deckDescriptor = new DeckDescriptor(new int[0], new String[0], new String[0]);
    }

    @Test
    void createDeckReturnsNewDeckWithGeneratedCards() {
        // Arrange
        List<Card> original = List.of(new Card("Ace", "Spades"), new Card("Ace", "Hearts"));
        List<Card> cards = new ArrayList<>(original);

        when(cardGeneratorMock.generate(new int[0], new String[0], new String[0])).thenReturn(cards);

        GermanDeckBuilder deckBuilder = new GermanDeckBuilder(cardGeneratorMock);

        // Act
        Deck deck = deckBuilder.createDeck();
        int cardCount = deck.getCardCount();

        // Assert
        Optional<Card> drawn = deck.drawOne();
        while (drawn.isPresent()) {
            assertTrue(original.contains(drawn.get()));
            drawn = deck.drawOne();
        }

        assertEquals(2, cardCount);
    }
}
