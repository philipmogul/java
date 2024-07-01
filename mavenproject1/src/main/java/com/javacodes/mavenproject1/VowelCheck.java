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
				System.out.println(vowels + ", is a vowel");
				break;
				
			case "e":
				System.out.println(vowels + ", is a vowel");
				break;
				
			case "i":
				System.out.println(vowels + ", is a vowel");
				break;
				
			case "o":
				System.out.println(vowels + ", is a vowel");
				break;
				
			case "u":
				System.out.println(vowels + ", is a vowel");
				break;
				
			default:
				System.out.println(vowels + ", is not a vowel.");
				break;
				
		}
		
	}

}
