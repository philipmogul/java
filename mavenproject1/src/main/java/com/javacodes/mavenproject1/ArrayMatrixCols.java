package com.javacodes.mavenproject1;

import java.util.Scanner;

public class ArrayMatrixCols {

	public static void main(String[] args) 
	{
		System.out.println("Inputting and adding a M by N matrix");
		System.out.print("Enter M and N Values Below: ");
		Scanner obj = new Scanner(System.in);
		int M = obj.nextInt();
		int N = obj.nextInt();
		
		// M by N array
		int Arr[][] = new int[M+1][N+1];
		
		// input into the array 
		for( int i = 0; i < M; i++ )
		{
			System.out.println("Enter " + N + " elements for row " + (i + 1));
			for( int j = 0 ; j  < N; j++ )
			{
				Arr[i][j] = obj.nextInt();
			}
		}
		
		
		// Sum of the matrix 
		int sumMN = 0;
		
		for( int i = 0; i < M + 1; i++ )
		{
			sumMN = 0;
			for( int j = 0; j < N; j++ )
			{
				sumMN = sumMN + Arr[j][i];
				System.out.print(Arr[i][j] + "\t");
			}
			Arr[M][i] = sumMN;
			System.out.println();
			
		}
		
		
	}

}
