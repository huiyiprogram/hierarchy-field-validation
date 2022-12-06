package com.example.demo.test;

public enum InfiniteCardType implements CardLogoType {
	
    FINAL_INFINITE1("Final Infinite 1"),
    FINAL_INFINITE2("Final Infinite 2"),
    FINAL_INFINITE3("Final Infinite 3");
	
	private String value;
	
	InfiniteCardType(String value) {
		this.value = value;
	}
	
	@Override
	public String getParent() {
        return VisaCardType.INFINITE.getValue();
    }

    public String getValue() {
		return this.value;
	}

}
