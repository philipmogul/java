package com.javacodes.mavenproject1;

import java.util.Scanner;

public class ArraysPrimeNumbers {

	public static void main(String[] args) 
	{
		System.out.println("Prime numbers present in an Integer Array!");
		
		int [] arr = new int[10];
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter into Array [] R = ");
		for( int i = 0; i < 10; i++ )
		{
			arr[i] = obj.nextInt();
		}
		
		System.out.println();
		
		
		System.out.print("The Prime Numbers Are => ");
		for( int i = 0; i < 10; i++ )
		{
			// test for prime numbers 
			int x = arr[i];
			int flag = 0;
			for( int k = 2; k < x; k++ )
			{
				if( x % k == 0 )
				{
					flag = 1;
				}
			}
			if( flag == 0 )
				System.out.println(arr[i] + ", ");
		}

	}

}
