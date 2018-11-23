package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Calculadora;

public class TestCalculadora {

	@Test
	public void TestSoma() {
		assertEquals(10, Calculadora.somar(7, 3));
		assertEquals(52, Calculadora.somar(50, 2));
		assertEquals(0, Calculadora.somar(0, 0));
	}

	@Test
	public void TestSubtracao() {
		assertEquals(10, Calculadora.subtrair(17, 10));
		assertEquals(0, Calculadora.subtrair(250, 250));
	}
}
