package com.javacodes.mavenproject1;

import java.util.Scanner;

public class GreaterOfTwo {

	public static int greater(int a, int b)
	{
		if( a > b )
			return a;
		else
			return b;
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Method for finding greater of two numbers.");
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter First Number => ");
		int a = obj.nextInt();
		System.out.print("Enter Second Number => ");
		int b = obj.nextInt();
		
		System.out.println("Greater of the two numbers is => " + greater(a, b) );

	}

}
