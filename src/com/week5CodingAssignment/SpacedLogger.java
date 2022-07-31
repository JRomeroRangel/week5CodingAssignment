package com.week5CodingAssignment;

public class SpacedLogger implements Logger {

	private StringBuilder spaced = new StringBuilder();
	private StringBuilder errors = new StringBuilder();
	
	@Override
	public void log(String log) {
	for ( int i= 0; i< log.length(); i++ ) {
		spaced.append(log.charAt(i)+ " ");
	
	}
	System.out.println(spaced);
		
	}

	@Override
	public void error(String error) {
		for ( int i= 0; i< error.length(); i++ ) {
			errors.append(error.charAt(i)+ " ");		
	}
		System.out.println("ERROR: "+ errors);

	}
}
