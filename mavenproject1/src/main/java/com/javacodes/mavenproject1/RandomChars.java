package com.javacodes.mavenproject1;

public class RandomChars {

	public static void main(String[] args) 
	{
		System.out.println("Program for finding random characters: ");
		int min = 1;
		int max = 99;
		
		int rand1 = (int) (Math.random() * ( max - min ) + 1 ) + min;
		int rand2 = (int) (Math.random() * ( max - min ) + 1 ) + min;
		int rand3 = (int) (Math.random() * ( max - min ) + 1 ) + min;
		
		System.out.println("Random characters generated above: ");
		System.out.println( (char) rand1 + " . " + (char) rand2 + " . " + (char) rand3 );
		
	}

}
