package org.exemple.demo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorTest {
	int i = 3;
	int j= 4;
	
	Calculator add;
	Calculator service = Mockito.mock(Calculator.class);

	@Before
	public void setUp() throws Exception {
		add= new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		add=null;
	}

	@Test
	public void testAjouter() {
		assertEquals(7,add.ajouter(i, j));
		when(service.ajouter(4, 8)).thenReturn(5);
		assertEquals(5, service.ajouter(4, 8));
		verify(service, times(1)).ajouter(4, 8);
	}

}
