package com.javacodes.mavenproject1;

import java.util.Scanner;

public class ArrayElementsOperations {

	public static void main(String[] args) 
	{
		System.out.println("Array Element Operations!\n1. Inserting. \n2. Deleting. \n3. Find Smallest element. \n4. Find 2nd largest element in array. ");
		
		System.out.println("INSERTING AN ELEMENT: ");
		int []In = {2,4,6,88,9};
		System.out.print("Enter Element to Insert into the array: ");
		
		// Enter position 
		System.out.print("Enter Position : ");
		Scanner Pos = new Scanner(System.in);
		int posArr = Pos.nextInt();
		
		
		// Enter Element 
		System.out.print("Enter Element : ");
		Scanner Obj1 = new Scanner(System.in);
		int elem = Obj1.nextInt();
		
		for( int i = In.length - 1; i >= (posArr - 1); i-- )
		{
			In[i + 1] = In[i];
		}
		In[posArr - 1] = elem;
		System.out.println("List after insertion: ");
		for( int i = 0; i < In.length; i++ )
		{
			System.out.println(In[i] + ", ");
		}
		
		
		System.out.println("DELETING AN ELEMENT: ");
		int []Del = {33,55,7,45,99,1000};
		System.out.print("Enter Element to Delete from the array: ");
		
		
		System.out.println("FIND SMALLEST ELEMENT IN ARRAY: ");
		int []Sm = {44,6000,70,1,22};
		int small = 0;
		for( int i = 0; i < Sm.length; i++ )
		{
			
		}
		
		System.out.println("FINDING SECOND LARGEST ELEMENT IN ARRAY: ");
		int []SLarg = {22,56,878,6,4};
		for( int i = 0; i < Sm.length; i++ )
		{
			
		}
		
		
	}

}
