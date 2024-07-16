package com.javacodes.mavenproject1;

import java.util.Scanner;

public class ArrayElemSearch {

	public static void main(String[] args) 
	{
		System.out.println("Searching for an element in an array :");
		Scanner obj = new Scanner(System.in);
		int []Arr = {2,4,6,8,9,44};
		System.out.print("Enter an element to search for: ");
		int elem = obj.nextInt();
		String message = "";
		int count = 0, pos = 0;
		
		for( int i = 0; i < Arr.length; i++ )
		{
			if( Arr[i] == elem )
			{
				pos = i; 
				count++;
				break;
			}
			else
			{
				// dont increment count 
			}
		}
		
		if (count == 1)
		{
			message = "Success! " + elem + " was found in the array, at Position " + pos;
		}
		else
		{
			message = elem + " is not in this array!";
		}
		System.out.println(message);
		
	}

}
