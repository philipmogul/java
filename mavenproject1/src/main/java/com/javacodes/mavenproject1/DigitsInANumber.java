package com.javacodes.mavenproject1;

import java.util.Scanner;

public class DigitsInANumber {

	public static void main(String[] args) 
	{
		System.out.println("Sum of digits in a number: ");
		System.out.print("Enter a number => ");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int sum = 0;
		
		while( n != 0 )
		{
			int rem = n % 10;
			sum = sum + rem;
			n /= 10; 
		}
		
		System.out.println("Sum is => " + sum);
		
	}

}
