package com.javacodes.mavenproject1;

import java.util.Scanner;

public class ArraysEvenNumbers {

	public static void main(String[] args) 
	{
		System.out.println("Finding Even Numbers in an Array!");
		System.out.println("Input elements into array and count the even numbers present! ");
		System.out.println("Enter into Array [] R = ");
		int [] arr = new int[10];
		
		Scanner obj = new Scanner(System.in);
		for( int i = 0; i < 10; i++ )
		{
			arr[i] = obj.nextInt();
		}
		
		int cnt = 0;
		System.out.println("Array elements entered above is : ");
		for( int i = 0; i < arr.length; i++ )
		{
			// test for even numbers 
			if( arr[i] % 2 == 0 )
			{ 
				cnt++;
			}
			System.out.print( arr[i] + ", ");
		}
		
		System.out.println();
		System.out.println("The number of even elements in the array is => " + cnt);
		
	}

}
