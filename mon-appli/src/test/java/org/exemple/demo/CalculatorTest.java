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
		assertEquals("Hello worldev",add.Hello("ev"));
		when(service.Hello("zrefr")).thenReturn("ergr");
		assertEquals("ergr", service.Hello("zrefr"));
		verify(service, times(1)).Hello("zrefr");
	}

}
