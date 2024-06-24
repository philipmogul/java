package com.javacodes.mavenproject1;

import java.util.Scanner;

public class PN0 {

	public static void main(String[] args) 
	{
		// CHECK IF NUMBER IS POSITIVE, NEGATIVE OR ZERO 
		System.out.print("Enter a number => ");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		
		if( num > 0 )
			System.out.println(num + " is Positive");
		else if( num < 0 )
			System.out.println(num + " is Negative");
		else
			System.out.println(num + " is Zero");
		
	}

}
