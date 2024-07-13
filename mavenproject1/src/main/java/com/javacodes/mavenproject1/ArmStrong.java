package com.javacodes.mavenproject1;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) 
	{
		System.out.println("Armstrong number is a digit if split, will return sum of the cubes of the individual digits.");
		System.out.println("Enter a number => ");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int num = n;
		int sum = 0;
		
		while( n != 0 )
		{
			int rem = n % 10;
			sum = sum + (rem * rem * rem);
			n /= 10;
		}
		
		if( num == sum )
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
		
	}

}
