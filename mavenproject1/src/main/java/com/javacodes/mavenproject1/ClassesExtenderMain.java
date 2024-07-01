package com.javacodes.mavenproject1;

public class ClassesExtenderMain extends ClassesExtenderSubs {

	public static void main(String[] args) 
	{
		ClassesExtenderMain mainobj = new ClassesExtenderMain();
		
		// Example usage of inherited methods
        int resultAdd = mainobj.add(10, 5);
        System.out.println("Addition result: " + resultAdd);

        int resultSubtract = mainobj.subtract(20, 8);
        System.out.println("Subtraction result: " + resultSubtract);

        int resultMultiply = mainobj.multiply(7, 3);
        System.out.println("Multiplication result: " + resultMultiply);

        double resultDivide = mainobj.divide(15, 4);
        System.out.println("Division result: " + resultDivide);
		
	}
	

}
