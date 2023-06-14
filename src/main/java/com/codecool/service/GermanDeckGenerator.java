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
    public static void main(String[] args) {

        CardGenerator generator = new CardGenerator();

        GermanDeckGenerator germanCardGenerator = new GermanDeckGenerator(generator);
        ArrayList<Card> germanDeck = germanCardGenerator.generateGermanDeck();
        print(germanDeck);
        // Use the generated German deck as needed
    }
    public static <T> void print(T item) {
        System.out.println(item);
    }
}
