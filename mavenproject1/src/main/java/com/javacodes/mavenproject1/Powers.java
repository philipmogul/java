package com.javacodes.mavenproject1;

import java.util.Scanner;

public class Powers {

	public static int powM(int a, int b)
	{
		int res = 1;
		for( int i = 1; i <= b; i++ )
		{
			res = res * a;
		}
		return res;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("User defined power method instead of the pow in Java.");
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a Number => ");
		int num = obj.nextInt();
		System.out.print("Enter a Power => ");
		int pow = obj.nextInt();
		
		System.out.println("Number " + num + " To The Power of " + pow + " Is => " + powM(num, pow));

	}

}
