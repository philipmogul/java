package com.javacodes.mavenproject1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) 
	{
		System.out.println("Enter a year and discover whether it is a leap year or not.");
		System.out.print("Enter a year: ");
		Scanner obj = new Scanner(System.in);
		int year = obj.nextInt();
		
		if( year % 4 == 0 )
			System.out.println("It is a leap year!");
		else
			System.out.println("Not a leap year!");
		
	}
}
