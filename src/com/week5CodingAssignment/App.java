package com.week5CodingAssignment;

public class App {

	public static void main(String[] args) {

		AsteriskLogger asterisk = new AsteriskLogger();
		SpacedLogger spaced = new SpacedLogger();
		
		asterisk.log("Hello");
		System.out.println();
		asterisk.error("Jesus");
		
		spaced.log("Hello");
		System.out.println();
		spaced.error("Jesus");
	}

}
