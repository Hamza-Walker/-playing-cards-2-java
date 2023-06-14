package com.codecool.service;

import com.codecool.model.*;

import java.util.ArrayList;
import java.util.List;

public class CardGeneratorImpl implements CardGenerator {

    @Override
    public List<Card> generate(int[] numbers, String[] symbols, String[] suits) {
        List<Card> cards = new ArrayList<>();

        for (String suit : suits) {
            addNumberedCards(cards, suit, numbers);
            addCourtCards(cards, suit, symbols);
        }

        return cards;
    }

    private void addNumberedCards(List<Card> cards, String suit, int[] numbers) {
        for (int number : numbers) {
            Card card = new Card(Integer.toString(number), suit);
            cards.add(card);
        }
    }

    private void addCourtCards(List<Card> cards, String suit, String[] symbols) {
        for (String symbol : symbols) {
            Card card = new Card(symbol, suit);
            cards.add(card);
        }
    }
}
