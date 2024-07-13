package com.javacodes.mavenproject1;

public class VowelsCount {

	public static void main(String[] args) 
	{
		String v = "helloo";
		
		int count = 0;
		
		for ( int i = 0; i < v.length(); i++ )
		{
			char ch = v.charAt(i);
			switch(ch)
			{
				case 'a':
				case 'A': 
				case 'e':
				case 'E': 
				case 'i':
				case 'I': 
				case 'o':
				case 'O': 
				case 'u':
				case 'U': 
					count++;
			}
			
		}
		
		System.out.println("Number of Vowels is " + count);
	}

}
