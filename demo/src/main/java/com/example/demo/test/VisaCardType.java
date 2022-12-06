package com.example.demo.test;

public enum VisaCardType implements CardLogoType {
	
    INFINITE("Infinite"),
    SIGNATURE("Signature"),
    PLATINUM("Platinum"),
    GOLD("Gold"),
    CLASSIC("Classic");

	private String value;
	
    VisaCardType(String value) {
		this.value = value;
	}

	public String getParent() {
        return CardType.VISA.getValue();
    }

    public String getValue() {
		return this.value;
	}
    
}