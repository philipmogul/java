package com.javacodes.mavenproject1;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) 
	{
		System.out.println("Converting Decimal to Binary!");
		
		System.out.print("Enter a number : ");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		
		String s = "";
		
		while( n != 0 )
		{
			s = s + n % 2;
			n = n / 2;
		}
		
		int i = s.length() - 1;
		while( i > 0 )
		{
			System.out.print(s.charAt(i) + " ");
			i--;
		}
		
	}

}
