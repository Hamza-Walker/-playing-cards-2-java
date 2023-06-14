package com.codecool.service;

import com.codecool.model.Card;

import java.util.List;

public interface CardGenerator {
 //the signature of this method, and no implementations so far.
    List<Card> generate (int [] numbers, String[] symbols, String[] suits);

}
