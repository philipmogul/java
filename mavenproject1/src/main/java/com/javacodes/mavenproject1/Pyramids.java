package com.javacodes.mavenproject1;

public class Pyramids {

	public static void main(String[] args) 
	{
		System.out.println("Printing Pyramids Rows and Columns!");
		
		System.out.println("Numbers!");
		for( int i = 1; i <= 5; i++ )
		{
			for( int j = 1; j <= i; j++ )
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Stars!");
		for( int i = 1; i <= 5; i++ )
		{
			for( int j = 1; j <= i; j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Additions!");
		for( int i = 1; i <= 5; i++ )
		{
			for( int j = 1; j <= i; j++ )
			{
				System.out.print("+");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Zeros!");
		for( int i = 1; i <= 5; i++ )
		{
			for( int j = 1; j <= i; j++ )
			{
				System.out.print("0");
			}
			System.out.println();
		}
		
	}

}
