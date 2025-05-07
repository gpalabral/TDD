package com.ucb.tdd;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.Test;
import org.junit.Before;

public class TresEnRayaTest {
	
	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void cuandoFueraDeXlanzarException() throws Exception{
		//1. Preparacion de la prueba
		TresEnRaya tresEnRaya =  new TresEnRaya();
		
		//2. Logica de la prueba
		
		//3. Verificacion o Assert
		exception.expect(Exception.class);
		
		tresEnRaya.jugar(5,2);
	}
	
	@Test
	public void cuandoFueraDeYlanzarException() throws Exception{
		//1. Preparacion de la prueba
		TresEnRaya tresEnRaya =  new TresEnRaya();
		//2. Logica de la prueba
		
		//3. Verificacion o Assert
		exception.expect(Exception.class);
		
		tresEnRaya.jugar(2,5);
	}
	
	@Test
	public void cuandoLugarOcupadoLanzarException() throws Exception{
		//1. Preparacion de la prueba
		TresEnRaya tresEnRaya =  new TresEnRaya();
		
		//2. Logica de la prueba
		tresEnRaya.jugar(1,3); //Jugador X
				
		//3. Verificacion o Assert
		exception.expect(Exception.class);
		tresEnRaya.jugar(1,3);//Jugador +
	}
	
	@Test
	public void cuandoLugarDiferenteNOLanzarException() throws Exception{
		//1. Preparacion de la prueba
		TresEnRaya tresEnRaya =  new TresEnRaya();
		
		//2. Logica de la prueba
		tresEnRaya.jugar(1,3); //Jugador X
		
		//3. Verificacion o Assert
		tresEnRaya.jugar(2,3);//Jugador +
	}
	
	@Test
	public void siPrimerTurnoEntoncesJuegaX() throws Exception{
		//1. Preparacion de la prueba
		TresEnRaya tresEnRaya =  new TresEnRaya();
		
		//2. Logica de la prueba
		
		//3. Verificacion o Assert
		assertEquals('x',tresEnRaya.siguienteTurno());//Jugador X
	}
	
	@Test
	public void siPrimerTurnoXsiguienteCruz() throws Exception{
		//1. Preparacion de la prueba
		TresEnRaya tresEnRaya =  new TresEnRaya();
		
		//2. Logica de la prueba
		tresEnRaya.jugar(1,3); //Jugador X
		
		//3. Verificacion o Assert
		assertEquals('+',tresEnRaya.siguienteTurno());//Jugador +
	}
	
	
	@Test
	public void siUltimoTurnoCruzSiguienteX() throws Exception{
		//1. Preparacion de la prueba
		TresEnRaya tresEnRaya =  new TresEnRaya();
		
		//2. Logica de la prueba
		tresEnRaya.jugar(1,3); //Jugador X
		
		//3. Verificacion o Assert
		assertEquals('+',tresEnRaya.siguienteTurno());
		
		tresEnRaya.jugar(2,3); //Jugador +
		assertEquals('x',tresEnRaya.siguienteTurno());
	}
	
	
	@Test
	public void cuandoNoHayGanador() throws Exception{
		//1. Preparacion de la prueba
		TresEnRaya tresEnRaya =  new TresEnRaya();
		
		//2. Logica de la prueba
		String resultado = tresEnRaya.jugar(1,3); //Jugador X
		
		//3. Verificacion o Assert
		assertEquals("No hay ganador aun",resultado);
	}
	
	    @Test
		public void siLlenaColumnaEntoncesGana() throws Exception{
			
			
			//1. Preparacion de la prueba
			
			TresEnRaya tresEnRaya =  new TresEnRaya();
			
			//2. Logica de la prueba
			tresEnRaya.jugar(2,1); //Jugador X
			tresEnRaya.jugar(1,1); //Jugador +
			tresEnRaya.jugar(3,1); //Jugador X
			tresEnRaya.jugar(1,2); //Jugador +
			tresEnRaya.jugar(2,2); //Jugador X
			
			String resultado = tresEnRaya.jugar(1,3); //Jugador +
			
			//3. Verificacion o Assert
			assertEquals("+ es el ganador",resultado);
		}

	
	
	
	
	@Test
	public void siLlenaFilaEntoncesGana() throws Exception{
		
		
		//1. Preparacion de la prueba
		
		TresEnRaya tresEnRaya =  new TresEnRaya();
		
		//2. Logica de la prueba
		tresEnRaya.jugar(1,1); //Jugador X
		tresEnRaya.jugar(1,2); //Jugador +
		tresEnRaya.jugar(2,1); //Jugador X
		tresEnRaya.jugar(3,1); //Jugador +
		tresEnRaya.jugar(2,2); //Jugador x
		tresEnRaya.jugar(1,3); //Jugador +
		
		String resultado = tresEnRaya.jugar(2,3); //Jugador X
		
		//3. Verificacion o Assert
		assertEquals("x es el ganador",resultado);
	}
	
	
}
