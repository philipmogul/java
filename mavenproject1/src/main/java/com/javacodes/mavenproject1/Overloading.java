package com.javacodes.mavenproject1;

public class Overloading {

	public static int sum(int a, int b)
	{
		return (a+b);
	}
	
	public static double sum(double a, double b)
	{
		return (a + b);
	}
	
	public static int sum(int a, int b, int c)
	{
		return (a + b + c);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Overloading => Same function names but does different operations based on parameters!");
		int a = 10;
		int b = 100;
		int c = 200;
		double da = 40;
		double db = 700;
		System.out.println(sum(a, b));
		System.out.println(sum(a, b, c));
		System.out.println(sum(da, db));
		
	}

}
