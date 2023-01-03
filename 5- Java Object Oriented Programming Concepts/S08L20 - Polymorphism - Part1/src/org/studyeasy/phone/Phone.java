package org.studyeasy.phone;

public class Phone {
	private String model;

	public Phone(String model) {
		this.model = model;
	}
    
	public void features(){
		System.out.println("Feature phone");
	}

	public String getModel() {
		return model;
	}
	
}
