package com.javacodes.mavenproject1;

import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) 
	{
		System.out.print("Enter character to see whether it is a vowel: ");
		Scanner obj = new Scanner(System.in);
		String vowels = obj.next();
		
		switch( vowels )
		{
			case "a":
			case "A":
			case "e":
			case "E":
			case "i":
			case "I":
			case "o":
			case "O":
			case "u":
			case "U":
				System.out.println(vowels + ", is a vowel");
				break;
				
			default:
				System.out.println(vowels + ", is not a vowel.");
				break;
				
		}
		
	}

}
