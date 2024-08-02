package com.javacodes.mavenproject1;

import java.util.Scanner;

public class CalculateAreas 
{
	// square 
	public static int area(int sq) 
	{
		return (sq * sq);
	}
	
	//circle 
	public static double area(double r)
	{
		double cr = Math.PI * r * r;
		return cr;
	}
	
	// rectangle 
	public static int area( int ln, int wt )
	{
		return (ln * wt);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Calculating areas of Square, Circle & Rectangle!");
		System.out.print("Enter length of a square : ");
		Scanner obj = new Scanner(System.in);
		int sl = obj.nextInt();
		System.out.println("Area of square of length " + sl + " is " + area(sl));
		System.out.print("Enter radius of a circle : ");
		double ra = obj.nextDouble();
		System.out.println("Area of circle of radius " + ra + " is " + area(ra));
		System.out.print("Enter length & width of a rectangle : ");
		int rln = obj.nextInt();
		int wth = obj.nextInt();
		System.out.println("Area of rectangle of lenght " + rln + " And width " + wth + " is " + area(rln, wth));
		

	}

}
