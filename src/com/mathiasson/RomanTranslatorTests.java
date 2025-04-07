package com.mathiasson;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RomanTranslatorTests {

	@Test
	void testRomanOne() // tests I
	{
		RomanTranslator rTranslator = new RomanTranslator();
		int expected = 1;
		int result = rTranslator.translateRomanToDecimal("I");
		assertEquals(expected, result);
	}
	
	@Test
	void testRomanTwo() //tests II
	{
		RomanTranslator rTranslator = new RomanTranslator();
		int expected = 2;
		int result = rTranslator.translateRomanToDecimal("II");
		assertEquals(expected, result);
	}
	
	@Test
	void testRomanV() //tests if the program can handle roman 5 "V"
	{
		RomanTranslator rTranslator = new RomanTranslator();
		int expected = 5;
		int result = rTranslator.translateRomanToDecimal("V");
		assertEquals(expected, result);
	}
	
	@Test
	void testCompositeRomanNumerals() // things like "IV" or "VI"
	{
		RomanTranslator rTranslator = new RomanTranslator();
		int expected = 6;
		int result = rTranslator.translateRomanToDecimal("VI");
		assertEquals(expected, result);
		
		expected = 4;
		result = rTranslator.translateRomanToDecimal("IV");
		assertEquals(expected, result);
	}
	
	@Test
	void testTensNumerals() // things like "IX" or "X" 
	{
		RomanTranslator rTranslator = new RomanTranslator();
		int expected = 10;
		int result = rTranslator.translateRomanToDecimal("X");
		assertEquals(expected, result);
		
		expected = 9;
		result = rTranslator.translateRomanToDecimal("IX");
		assertEquals(expected, result);
		
		expected = 15;
		result = rTranslator.translateRomanToDecimal("XV");
		assertEquals(expected, result);
	}
}
