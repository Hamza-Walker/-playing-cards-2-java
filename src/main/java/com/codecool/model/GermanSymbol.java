package com.codecool.model;

public enum GermanSymbol {
    NUMBER_7(7),
    NUMBER_8(8),
    NUMBER_9(9),
    NUMBER_10(10),
    UNTER,
    OBER,
    KING,
    ACE;

    private final int value;

    GermanSymbol(){
        this.value = -1;
    }
    GermanSymbol (int value) {
        this.value = value;
    }
    public static GermanSymbol NUMBER(int number) {
        switch (number) {
            case 7:
                return NUMBER_7;
            case 8:
                return NUMBER_8;
            case 9:
                return NUMBER_9;
            case 10:
                return NUMBER_10;
            default:
                throw new IllegalArgumentException("Invalid German card number: " + number);
        }
    }

}
