package com.example.demo.test;

public enum CardType {
	
    VISA("Visa"),
    MASTERCARD("Mastercard"),
    AMEX("American Express");
    
    private String value;
	
    CardType(String value) {
        this.value = value;
    }
    
	public String getValue() {
		return this.value;
	}
	
}
