package com.javacodes.mavenproject1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		System.out.print("Enter a number to get the Fibonacci => ");
		Scanner obj = new Scanner(System.in);
		int fib = obj.nextInt();
		int i=0, a=0, b=1, sum=0; 
		
		while( i < fib )
		{
			System.out.print(a + ", ");
			sum = a + b; 
			a = b;
			b = sum;
			i++;
		}
		
		
		System.out.println("\nThe fibonacci of "+ fib + ", is => " + sum);
		
	}

}
