package com.mathiasson;

import java.util.Arrays;

public class RomanTranslator {
	public static void main(String[] args)
	{
		
	}
	
	public int translateRomanToDecimal(String number) 
	{
		char romans[] = {'I', 'V', 'X'};
		int values[] = {1, 5, 10};
 		
		int result = 0;
		int previous = 0;
		int current = 0;
		for(int i = number.length() - 1; i >= 0; i--)
		{
			char c = number.charAt(i);
			current = values[Arrays.binarySearch(romans, c)];
			if(current < previous)
			{
				result -= current;
			}
			else
			{
				result += current;
			}
			previous = current;
		}
		return result;
	} 
}

