package com.javacodes.mavenproject1;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) 
	{
		System.out.println("Prime Numbers!");
		System.out.print("Enter a Number: ");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		
		for ( int i = 2; i < n; i++ )
		{
			if( n % i == 0 )
			{
				System.out.println("Is NOT a prime number!");
				break;
			}
			else
			{
				System.out.println("Is a prime number!");
				break;
			}
		}

	}

}
