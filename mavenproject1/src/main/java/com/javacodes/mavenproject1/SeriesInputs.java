package com.javacodes.mavenproject1;

import java.util.Scanner;

public class SeriesInputs {

	public static void main(String[] args) 
	{
		System.out.println("Series Based on Inputs!");
		System.out.println("Enter 3 numbers. ");
		System.out.print("First Number => ");
		Scanner obj1 = new Scanner(System.in);
		int n1 = obj1.nextInt();
		System.out.print("Second Number, Number to increment by => ");
		Scanner obj2 = new Scanner(System.in);
		int n2 = obj2.nextInt();
		System.out.print("Last Number, Last number in sequence => ");
		Scanner obj3 = new Scanner(System.in);
		int n3 = obj3.nextInt();
		
		for( int i = n1; i < n3; i = i + n2 )
		{
			System.out.print( i + " " );
		}
		
	}

}
