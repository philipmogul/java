package com.javacodes.mavenproject1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		System.out.println("Reverse a number: ");
		System.out.print("Enter a number => ");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int rev = 0; 
		
		while( n != 0 )
		{
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println("Reversed => " + rev);
		
	}

}
