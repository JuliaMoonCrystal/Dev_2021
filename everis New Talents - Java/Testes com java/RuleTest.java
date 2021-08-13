package com.teste;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class RuleTest {

	
	@Rule
	public TemporaryFolder  tempFolder= new TemporaryFolder();
	
	@Test
	public void shoudCreateNewTemporaryFolder () throws IOException{
		
		File created= tempFolder.newFile("arquivo.txt");
		
		assertTrue(created.isFile());
		assertEquals(tempFolder.getRoot(), created.getParentFile());
	}
	
	
}
