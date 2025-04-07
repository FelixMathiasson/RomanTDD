package com.mathiasson;

public class RomanTranslator {
	public static void main(String[] args)
	{
		
	}
	
	public int translateRomanToDecimal(String number) 
	{
		int result = 0;
		for(int i = 0; i < number.length(); i++)
		{
			if(number.charAt(i) == 'I') result++;
			else if(number.charAt(i) == 'V')result+=5;
		}
		return result;
	} 
}
