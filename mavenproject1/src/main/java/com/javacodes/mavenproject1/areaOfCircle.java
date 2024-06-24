package com.javacodes.mavenproject1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class areaOfCircle {

	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("#.###");
		
		System.out.println("This program calculates the area of a circle!");
		System.out.print("Enter the radius: ");
		Scanner obj = new Scanner(System.in);
		double radius = obj.nextDouble();
		System.out.println();
		
		System.out.print("The area of the circle = ");
		double area = Math.PI * radius * radius;
		System.out.print(df.format(area));
		
	}

}
