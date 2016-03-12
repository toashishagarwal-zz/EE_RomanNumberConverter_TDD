package com.ee;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanConverterTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void shouldGive1forI() {
		// setup
		final String input = "I";
		final int expected = 1;
		
		// execute
		int actual = RomanConverter.convert(input);
		
		// verify
		Assert.assertEquals("Expected does not match actual value for 1", expected, actual);
	}
	
	@Test
	public void shouldGive2forII() {
		// setup
		final String input = "II";
		final int expected = 2;
		
		// execute
		int actual = RomanConverter.convert(input);
		
		// verify
		Assert.assertEquals("Expected does not match actual value for 2", expected, actual);
	}
	
	@Test
	public void shouldGive5forV() {
		// setup
		final String input = "V";
		final int expected = 5;
		
		// execute
		int actual = RomanConverter.convert(input);
		
		// verify
		Assert.assertEquals("Expected does not match actual value for 5", expected, actual);
	}
	
	@Test
	public void shouldGive4forIV() {
		// setup
		final String input = "IV";
		final int expected = 4;
		
		// execute
		int actual = RomanConverter.convert(input);
		
		// verify
		Assert.assertEquals("Expected does not match actual value for 4", expected, actual);
	}
	
	@Test
	public void shouldGive49forXLIX() {
		// setup
		final String input = "XLIX";
		final int expected = 49;
		
		// execute
		int actual = RomanConverter.convert(input);
		
		// verify
		Assert.assertEquals("Expected does not match actual value for 49", expected, actual);
	}
	
	@Test
	public void shouldGive48forXLVIII() {
		// setup
		final String input = "XLVIII";
		final int expected = 48;
		
		// execute
		int actual = RomanConverter.convert(input);
		
		// verify
		Assert.assertEquals("Expected does not match actual value for 48", expected, actual);
	}
	
	@Test
	public void shouldGive540forDXL() {
		// setup
		final String input = "DXL";
		final int expected = 540;
		
		// execute
		int actual = RomanConverter.convert(input);
		
		// verify
		Assert.assertEquals("Expected does not match actual value for 540", expected, actual);
	}
	
	
	@Test
	public void shouldGive875forDCCCLXXV() {
		// setup
		final String input = "DCCCLXXV";
		final int expected = 875;
		
		// execute
		int actual = RomanConverter.convert(input);
		
		// verify
		Assert.assertEquals("Expected does not match actual value for 875", expected, actual);
	}
}
