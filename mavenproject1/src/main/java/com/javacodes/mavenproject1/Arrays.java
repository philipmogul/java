package com.javacodes.mavenproject1;

public class Arrays {

	public static void main(String[] args) 
	{
		System.out.println("Arrays in Java!");
		int []arr = {1,33,5,23,67,8};
		
		System.out.print("1D Array arr[] = { ");
		for( int i = 0; i < arr.length; i++ )
		{
			System.out.print(arr[i] + ", ");
		}
		
		System.out.print("}");
		System.out.println();
		System.out.println();
		
		// 2 D arrays 
		
		int [][]arr2d = {{1,33,5},{5,55,555,5555},{8,9},{33,22,66,88}};
		System.out.print("2D Array arr2d[] \n");
		for( int i = 0; i < arr2d.length; i++ )
		{
			for( int j = 0; j < arr2d[i].length; j++ )
			{
				System.out.print(arr2d[i][j] + ", ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Random numbers in an Array
		int []R = new int[10]; 
		int min = 10, max = 50;
		
		for( int i = 0; i < R.length; i++ )
		{
			int x = (int) (Math.random() * ( max - min ) + 1) + min;
			R[i] = x;
		}
		
		for( int i = 0; i < R.length; i++ )
		{
			System.out.print(R[i] + ", ");
		}
		
	}

}
