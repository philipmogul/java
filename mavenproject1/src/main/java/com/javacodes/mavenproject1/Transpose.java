package com.javacodes.mavenproject1;

public class Transpose {

	public static void main(String[] args) 
	{
		System.out.println("Transpose a Matrix.");
		
		int X[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Before Transpose. ");
		for( int i = 0; i < 3; i++ )
		{
			for( int j = 0; j < 3; j++ )
			{
				System.out.print(X[i][j] +  " ");
			}
			System.out.println();
		}
		
		System.out.println("After Transpose. ");
		for( int i = 0; i < 3; i++ )
		{
			for( int j = 0; j < i; j++ )
			{
				int t = X[i][j];
				X[i][j] = X[j][i];
				X[j][i] = t;
			}
		}
		
		
		for( int i = 0; i < 3; i++ )
		{
			for( int j = 0; j < 3; j++ )
			{
				System.out.print(X[i][j] +  " ");
			}
			System.out.println();
		}
		
	}

}
