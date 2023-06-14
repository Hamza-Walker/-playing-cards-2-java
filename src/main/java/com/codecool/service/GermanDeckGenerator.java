package com.codecool.service;

import com.codecool.model.Card;

import java.util.ArrayList;

public class GermanDeckGenerator {
    private final CardGenerator cardGenerator;

    public GermanDeckGenerator(CardGenerator cardGenerator) {
        this.cardGenerator = cardGenerator;
    }

    public ArrayList<Card> generateGermanDeck() {
        return cardGenerator.generateGermanDeck();
    }

    public static <T> void print(T item) {
        System.out.println(item);
    }
}
