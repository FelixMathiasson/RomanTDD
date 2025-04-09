package com.mathiasson;

import java.util.Arrays;

public class RomanTranslator {
	public static void main(String[] args)
	{
		
	}
	
	public int translateRomanToDecimal(String number) 
	{
		if(number == null) return -1;
			
		char romans[] = {'C', 'D', 'I', 'L', 'M', 'V', 'X'}; 
	    int values[] = {100, 500, 1, 50, 1000, 5, 10}; 
 		
		int result = 0, previous = 0, current = 0;
		
		for(int i = number.length() - 1; i >= 0; i--)
		{
			int index = Arrays.binarySearch(romans, number.charAt(i)); 
			if(index < 0) return -1;
			
			current = values[index];
			result += current < previous ? -current : current;
			
			previous = current;
		}
		return result;
	} 
}

