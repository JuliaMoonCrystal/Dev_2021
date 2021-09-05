package com.teste;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {

	
	//esperada
	@Test
	(expected=IndexOutOfBoundsException.class)
	
	public void empty(){
		new ArrayList<Object>().get(0);
	}
	
	//não esperado
	@Test
	(expected=IndexOutOfBoundsException.class)
	
	public void isNotempty(){
		List<String> lista = new ArrayList<String>();
		lista.add("Gilmar");
		
		lista.get(0);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void shouldTestExceptionMessage() throws IndexOutOfBoundsException{
		List <Object> list =new ArrayList<Object>();
		
		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("Index: 0, Size: 0");
		list.get(0);
	}
/*	
	@Test
	public void testExceptionMessager(){
		try{
			new ArrayList<Object>().get(0);
			fail("Esperado que ExceptionBoundsException seja lançada");
		} catch (IndexOutOfBoundsException ex){
			assertThat(ex.getMessage(), is("Index : 0, Size: 0"));
		}
	}
	*/
}
