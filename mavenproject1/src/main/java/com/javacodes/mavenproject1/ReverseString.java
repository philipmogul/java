package com.javacodes.mavenproject1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		System.out.println("Reverse a string!");
		System.out.print("Enter a String: ");
		Scanner obj = new Scanner(System.in);
		String rev = obj.nextLine();
		String reversed = "";
		
		for( int i = rev.length() - 1; i >= 0; i-- )
		{
			reversed = reversed + rev.charAt(i);
		}
		
		System.out.println("Original String = " + rev + "\nReversed String = " + reversed);
		
	}

}
