package com.javacodes.mavenproject1;

import java.util.Scanner;

public class TestingCases {

	public static void main(String[] args) 
	{
		System.out.println("This program tests to see for: uppercase, lowecase or symbol conditions");
		
		System.out.print("Enter a character => ");
		Scanner obj = new Scanner(System.in);
		char ch = obj.next().charAt(0);
		
		if( ch >= 65 && ch <= 90 )
			System.out.println(ch + " is Upper case!");
		else if( ch >= 97 && ch <= 122  )
			System.out.println(ch + " is Lower case!");
		else
			System.out.println(ch + " might be a symbol!");
		
	}

}
