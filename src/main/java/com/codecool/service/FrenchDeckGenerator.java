package com.codecool.service;

import com.codecool.model.Card;

import java.util.ArrayList;

public class FrenchDeckGenerator {
    private final CardGenerator cardGenerator;

    public FrenchDeckGenerator(CardGenerator cardGenerator) {
        this.cardGenerator = cardGenerator;
    }

    public static void main(String[] args) {
        CardGenerator generator = new CardGenerator();
        FrenchDeckGenerator frenchCardGenerator = new FrenchDeckGenerator(generator);

        ArrayList<Card> frenchDeck = frenchCardGenerator.cardGenerator.generateFrenchDeck();
        print(frenchDeck);
        // Use the generated French deck as needed

    }

    public static <T> void print(T item) {
        System.out.println(item);
    }
}
