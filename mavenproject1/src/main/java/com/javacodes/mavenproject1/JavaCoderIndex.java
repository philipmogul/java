package com.javacodes.mavenproject1;

import java.util.Scanner;

public class JavaCoderIndex {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Verbose Java!");
		
		// Enter Your name: 
		System.out.print("Enter your name: ");
		Scanner objName = new Scanner(System.in);
		String name = objName.nextLine();
		System.out.println();
		
		// Enter number: 
		System.out.print("Enter your age: ");
		Scanner obj = new Scanner(System.in);
		int age = obj.nextInt();
		System.out.println();
		
		
		// Enter networth: 
		System.out.print("Enter your networth: ");
		Scanner objNet = new Scanner(System.in);
		double netW = objNet.nextDouble();
		System.out.println();
		
		System.out.println("Your name => " + name + "\nYour age => " + age + "\nYour networth = " + netW);
		
	}

}
