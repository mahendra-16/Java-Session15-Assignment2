package com.apps.app;

public class Message {

	private String capital;

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	public void show(){
		System.out.println("Capital : " + this.capital);
	}
	
	
}
