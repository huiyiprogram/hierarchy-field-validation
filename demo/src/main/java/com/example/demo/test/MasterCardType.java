package com.example.demo.test;

public enum MasterCardType implements CardLogoType {

    STANDARD("Standard"),
    WORLD("World"),
    GOLD("Gold"),
    PLATINUM("Platinum"),
    BLACK("Black");

    private String value;

    MasterCardType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public String getParent() {
        return CardType.MASTERCARD.getValue();
    }
    
}