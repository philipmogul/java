package com.javacodes.mavenproject1;

import java.util.Scanner;

public class ArraySmallestNLargest {

	public static void main(String[] args) 
	{
		System.out.println("Finding Smallest & Largest Elements in an Array.");
		
		int []Arr = new int[10];
		System.out.print("Enter 5 Elements to be inserted into the array: ");
		Scanner obj = new Scanner(System.in);
		
		for( int i = 0; i < 5; i++ )
		{
			Arr[i] = obj.nextInt();
		}
		
		int small = Arr[0];
		
		for( int i = 0; i < 5; i++ )
		{
			if( Arr[i] < small )
			{
				small = Arr[i];
			}
		}
		
		System.out.println("The smallest element in the array is => " + small);
		
		int big = Arr[0];
		
		for( int i = 0; i < 5; i++ )
		{
			if( Arr[i] > big )
			{
				big = Arr[i];
			}
		}
		
		System.out.println("The largest element in the array is => " + big);
		
	}

}
