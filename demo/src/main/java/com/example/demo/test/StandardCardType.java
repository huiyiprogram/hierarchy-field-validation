package com.example.demo.test;

public enum StandardCardType implements CardLogoType {
	
    FINAL_STANDARD1("Final Standard 1"),
    FINAL_STANDARD2("Final Standard 2"),
    FINAL_STANDARD3("Final Standard 3");
	
	private String value;
	
	StandardCardType(String value) {
		this.value = value;
	}
	
	@Override
	public String getParent() {
        return MasterCardType.STANDARD.getValue();
    }

    public String getValue() {
		return this.value;
	}

}
