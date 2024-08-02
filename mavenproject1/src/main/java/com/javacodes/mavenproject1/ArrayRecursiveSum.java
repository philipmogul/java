package com.javacodes.mavenproject1;

public class ArrayRecursiveSum {

	public static int sum(int X[], int len)
	{
		if(  len == 0 )
		{
			return 0;
		}
		else
		{
			return sum(X, len - 1) + X[len - 1];
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Recursively finding sum of array.");
		int X[] = {10, 20, 30, 40};
		System.out.println("Sum is " + sum(X, X.length));
		
	}

}
