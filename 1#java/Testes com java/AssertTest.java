package com.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {
   
	@Test
	public void testAssertArrayEquals(){
		byte[] esperado= "teste".getBytes();
		byte[] atual="teste".getBytes();
		assertArrayEquals(esperado, atual);
	}
	
	@Test
	public void testAssertEquals(){
		assertEquals("teste","teste");
	}
	
	@Test
	public void testAssertFalse(){
		assertFalse(false);
	}
	
	@Test
	public void testAssertNotNull(){
		assertNotNull(new Object());
	}
	
	@Test
	public void testAssertNotSame(){
	assertNotSame(new Object(), new Object());	
	}
	
	@Test
	public void testAssertNull(){
		assertNull(null);
	}
	
	@Test
	public void testAssertSame(){
		Integer number= Integer.valueOf(233);
		assertSame(number, number);
	}
}
