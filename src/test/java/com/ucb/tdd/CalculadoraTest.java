package com.ucb.tdd;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class CalculadoraTest {
	
	@Rule
	public ExpectedException exception = ExpectedException.none();

	
	
	@Test
	public void siCadenaVaciaRetornarCero() throws Exception{
		
		//1. Preparacion de la prueba
		Calculadora c = new Calculadora();
		
		//2. Logica de la prueba
		String resultadoActual = c.suma("");
		String resultadoEsperado = "0";
		
		//3. Verificacion o Assert
		assertEquals(resultadoEsperado,resultadoActual);
	}
	
	
	@Test
	public void para2numerosRetornarSuma() throws Exception {
		//1. Preparacion de la prueba
		Calculadora c = new Calculadora();
				
		//2. Logica de la prueba
				
		//3. Verificacion o Assert
		assertEquals("5",c.suma("2,3"));
		assertEquals("100",c.suma("50,50"));
		assertEquals("50",c.suma("49,1"));
		assertEquals("5",c.suma("5,0"));
		assertEquals("15",c.suma("5,10"));
	}
	
	
	@Test
	public void para3numerosRetornarSuma() throws Exception{
		//1. Preparacion de la prueba
		Calculadora c = new Calculadora();
				
		//2. Logica de la prueba
		
				
		//3. Verificacion o Assert
		assertEquals("10",c.suma("2,3,5"));
		assertEquals("1",c.suma("1,0,0"));
		assertEquals("90",c.suma("30,30,30"));
		assertEquals("0",c.suma("4500,4500,0"));
	}
	
	@Test
	public void ignorarNumerosMayores1000() throws Exception {
		//1. Preparacion de la prueba
		Calculadora c = new Calculadora();
				
		//2. Logica de la prueba
		
				
		//3. Verificacion o Assert
		assertEquals("7",c.suma("2,3000,5"));
		assertEquals("1099",c.suma("100,999"));
		assertEquals("1999",c.suma("1000,999"));

		
	}
	
	
	@Test
	public void paraNumerosNegativosLanzarException() throws Exception{
		
		//1. Preparacion de la prueba
		Calculadora c = new Calculadora();
				
		//2. Logica de la prueba
		
				
		//3. Verificacion que se lanza una excepcion
		exception.expect(Exception.class);
		
		assertEquals("0",c.suma("1001,-10"));
		assertEquals("x",c.suma("901,-10"));
		
	}
	
	
	
	
	
	
	/*
	@Test
	public void siCadenaVaciaRetornarCero() throws Exception{
		//1. Preparacion de la prueba
		Calculadora c = new Calculadora();
		
		//2. Logica de la prueba
		String resultado = c.suma("");
		
		//3. Verificacion o Assert
		assertEquals("0",resultado);
	}
	
	
	 
	 
	 
	@Test
	public void para2numerosRetornarSuma() throws Exception{
		//1. Preparacion de la prueba
		Calculadora c = new Calculadora();
				
		//2. Logica de la prueba
		
				
		//3. Verificacion o Assert
		assertEquals("5",c.suma("2,3"));
		assertEquals("3",c.suma("0,3"));
		assertEquals("55",c.suma("44,11"));
		assertEquals("20",c.suma("10,10"));
	}
	
	@Test
	public void para3numerosRetornarSuma() throws Exception{
		//1. Preparacion de la prueba
		Calculadora c = new Calculadora();
				
		//2. Logica de la prueba
		
				
		//3. Verificacion o Assert
		assertEquals("10",c.suma("2,3,5"));
		assertEquals("3",c.suma("1,2,0"));
		assertEquals("55",c.suma("20,20,15"));
		assertEquals("20",c.suma("10,5,5"));
	}
	
	@Test
	public void paraNumerosMayores1000Ignorar() throws Exception{
		//1. Preparacion de la prueba
		Calculadora c = new Calculadora();
				
		//2. Logica de la prueba
		
				
		//3. Verificacion o Assert
		assertEquals("10",c.suma("1001,10"));
		
	}
	
	@Test
	public void paraNumerosNegativosLanzarException() throws Exception{
		//1. Preparacion de la prueba
		Calculadora c = new Calculadora();
				
		//2. Logica de la prueba
		
				
		//3. Verificacion o Assert
		exception.expect(Exception.class);
		assertEquals("10",c.suma("1001,-10"));
		
	}
	
	*/

}
