package com.javacodes.mavenproject1;

import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) 
	{
		System.out.println("Enter a minimum and maximum number to generate random numbers");
		System.out.print("Enter minimum: ");
		Scanner minObj = new Scanner(System.in);
		int min = minObj.nextInt();
		
		System.out.print("Enter maximum: ");
		Scanner maxObj = new Scanner(System.in);
		int max = maxObj.nextInt();
		System.out.println();
		System.out.println("The random numbers of the above range is : ");
		
		System.out.print( Math.floor(Math.random() * ( max - min ) + 1 + min ));
		
	}

}
