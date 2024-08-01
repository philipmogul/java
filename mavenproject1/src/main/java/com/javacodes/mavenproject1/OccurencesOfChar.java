package com.javacodes.mavenproject1;

import java.util.Scanner;

public class OccurencesOfChar {

	public static int countChars(String str, char ch)
	{
		int count = 0;
		for( int i = 0; i < str.length(); i++ )
		{
			if( ch == str.charAt(i) )
			{
				count++;
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Occurences of a character in a string: ");
		System.out.print("Enter a String => ");
		Scanner obj = new Scanner(System.in);
		String str = obj.nextLine();
		System.out.println("Enter a character => ");
		char ch = obj.next().charAt(0);
		
		int ct = countChars(str, ch);
		
		System.out.println("Number of Occurences is => " + ct);
		
	}

}
