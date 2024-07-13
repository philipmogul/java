package com.javacodes.mavenproject1;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) 
	{
		System.out.println("Testing whether a number is a perfect number!");
		System.out.print("Enter a number => ");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		
		// 28 
		// 14 + 7 + 4 + 2 + 1
		
		int i = 2;
		int sum = 1;
		
		while( i < num )
		{
			if ( num % i == 0  )
			{
				sum = sum + i;
			}
			i++;
		}
		
		if ( sum == num )
		{
			System.out.println(num + ", is a Perfect Number!");
		}
		else
		{
			System.out.println(num + ", is NOT a Perfect Number!");
		}
		
	}

}
