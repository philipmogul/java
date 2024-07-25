package com.javacodes.mavenproject1;

public class ArraySecondLargest {

	public static void main(String[] args) 
	{
		System.out.println("The Largest and Second Largest Elements in array: ");
		int Largest = 0, S_Largest = 0;
		
		int []Arr = {12,3,34,2323,12};
		
		for( int i = 0; i < 5; i++ )
		{
			System.out.print(Arr[i] + " ,");
		}
		System.out.println();
		
		for( int i = 0; i < Arr.length; i++ )
		{
			if( Arr[i] > Largest )
			{
				S_Largest = Largest;
				Largest = Arr[i];
			}
			else if( Arr[i] > S_Largest )
			{
				S_Largest = Arr[i];
			}
		}
		
		System.out.println("Largest in the array => " + Largest);
		System.out.println("Second Largest in the array => " + S_Largest);
		
	}

}
