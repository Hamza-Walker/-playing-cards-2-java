package com.codecool.model;

public enum GermanSymbol {
    UNTER,
    OBER,
    KING,
    ACE;

    public static GermanSymbol NUMBER(int number) {
        switch (number) {
            case 7:
                return UNTER;
            case 8:
                return OBER;
            case 9:
                return KING;
            case 10:
                return ACE;
            default:
                throw new IllegalArgumentException("Invalid German card number: " + number);
        }
    }
}
