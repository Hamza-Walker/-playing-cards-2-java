package com.codecool.model;

public enum Symbol {
    NUMBER_2(2),
    NUMBER_3(3),
    NUMBER_4(4),
    NUMBER_5(5),
    NUMBER_6(6),
    NUMBER_7(7),
    NUMBER_8(8),
    NUMBER_9(9),
    NUMBER_10(10),
    JACK,
    QUEEN,
    KING,
    ACE;


    private final int value;

    Symbol(){
        this.value = -1;
    }
    Symbol (int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public static Symbol NUMBER(int value){
        return Symbol.values()[value - 2];
    }

}
