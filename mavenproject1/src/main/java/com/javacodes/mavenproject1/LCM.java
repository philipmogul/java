package com.javacodes.mavenproject1;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) 
	{
		System.out.println("Printing LCM of 2 numbers!");
		System.out.println("Enter 2 numbers. ");
		System.out.print("First Number => ");
		Scanner obj1 = new Scanner(System.in);
		int n1 = obj1.nextInt();
		
		System.out.print("Second Number => ");
		Scanner obj2 = new Scanner(System.in);
		int n2 = obj2.nextInt();
		
		int lcm;
		
		if( n1 > n2 )
			lcm = n1;
		else
			lcm = n2;
		
		int i = 2, b = lcm;
		
		while( lcm % n1 != 0 || lcm %n2 != 0 )
		{
			lcm = b * i;
			i++;
		}
		
		System.out.println("Lcm of " + n1 + " & " + n2 + " is => " + lcm );
		
	}

}
