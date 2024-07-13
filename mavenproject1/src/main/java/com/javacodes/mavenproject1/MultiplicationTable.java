package com.javacodes.mavenproject1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) 
	{
		System.out.println("Multiplication table till 20! ");
		System.out.print("Enter a number: ");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		
		for( int i = 1; i <= 20; i++ )
		{
			System.out.println( n + " X " + i + " = " + (i * n ));
		}

	}

}
