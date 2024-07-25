package com.javacodes.mavenproject1;

import java.util.Scanner;

public class ArrayElementsOperations {

	public static void main(String[] args) 
	{
		System.out.println("INSERTING AN ELEMENT: ");
		int []Arr = new int[10];
		System.out.print("Enter 5 Elements to be inserted into the array: ");
		Scanner obj = new Scanner(System.in);
		
		for( int i = 0; i < 5; i++ )
		{
			Arr[i] = obj.nextInt();
		}
		
		System.out.println("The Array Elements Entered Are: ");
		for( int i = 0; i < 5; i++ )
		{
			System.out.print(Arr[i] + ", ");
		}
		
		
		System.out.print("Enter Position to insert an element into the array: ");
		int pos = obj.nextInt();
		
		System.out.print("Enter Element to insert into the array: ");
		int elem = obj.nextInt();
		
		for( int i = 4; i >= (pos-1); i-- )
		{
			Arr[i+1] = Arr[i];
		}
		Arr[pos-1] = elem;
		
		System.out.println("The Array Elements After Insertion: ");
		for( int i = 0; i < 5; i++ )
		{
			System.out.print(Arr[i] + ", ");
		}
		
		// Delete element from array
		System.out.print("Enter Position to delete an element into the array: ");
		int del = obj.nextInt();
		
		for( int i = del; i < 5; i++ )
		{
			Arr[i - 1] = Arr[i];
		}
		
		System.out.println("The Array Elements After Deletion: ");
		for( int i = 0; i < 4; i++ )
		{
			System.out.print(Arr[i] + ", ");
		}
		
		
	}

}
