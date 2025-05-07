package com.ucb.tdd;

public class TresEnRaya {
	
	private Character[][] tablero = {{'0', '0', '0'},
			 						 {'0', '0', '0'},
			 						 {'0', '0', '0'}};
	
	private char ultimoJugador = '+';
	
	public String jugar(int x, int y) throws Exception {
		
		verificarEje(x);
		verificarEje(y);
		
		ultimoJugador = siguienteTurno();
		asignarPosicion(x,y,ultimoJugador);
		
		if(hayGanador()) {
			return ultimoJugador +" es el ganador";
		}
		
		return "No hay ganador aun";
	}
	
	private final int SIZE=3;
	private boolean hayGanador() {
		
		int total=ultimoJugador*SIZE;
		
		for(int i=0;i < SIZE;i++) {
			if(tablero[i][0]+ 
			   tablero[i][1]+		 
			   tablero[i][2]==total ) {
				return true;
				
			} else if(tablero[0][i] + 
					   tablero[1][i] +		 
					   tablero[2][i]== total) {
				return true;
			}
		}
		return false;
	}
	
	private void verificarEje(int eje) throws Exception{
		if(eje<1 || eje>3) {
			throw new Exception("Eje fuera del tablero");
		}
	}
	
	private void asignarPosicion(int x, int y, char ultimoJugador)throws Exception {
		if(tablero[x-1][y-1]!='0') {
			throw new Exception("La casilla ya esta ocupada");
		}else {
			tablero[x-1][y-1]=ultimoJugador;
		}
	}
	
	
	
	public char siguienteTurno() {
		if(ultimoJugador == 'x') {
			return '+';
		}
		return 'x';
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	private char ultimoJugador = '+';
	private final int TAMANHO = 3;
	
	public String jugar(int x, int y) throws Exception {
		
		verificarEje(x);
		verificarEje(y);
		
		ultimoJugador = siguienteTurno();
		asignarPosicion(x, y);
		
		if(hayGanador()) {
			return ultimoJugador + " es el ganador";
		}
		
		return "No hay ganador aun";
	}
	
	private boolean hayGanador() {
		int total = ultimoJugador * TAMANHO;
		
		for(int i=0; i < TAMANHO; i++) {
			//Logica de las columnas
			if(tablero[0][i] + tablero[1][i] + tablero[2][i] == total) {
				return true;
			}
			//Logicas de las filas
			if(tablero[i][0] + tablero[i][1] + tablero[i][2] == total) {
				return true;
			}
		}
		return false;
	}

	private void asignarPosicion(int x, int y) {
		if (tablero[x - 1][y - 1] != '0') {
            throw new RuntimeException("La casilla esta ocupada");
        } else {
            tablero[x - 1][y - 1] = ultimoJugador;
            System.out.println("Asignando posicion: "+x+","+y);
        }
	}
	
	public void verificarEje(int eje)throws Exception {
		if(eje < 1 || eje > 3) {
			throw new Exception("La coordenada "+eje+" esta fuera del tablero");		}
	}
	
	public char siguienteTurno() {
		
		if(ultimoJugador == 'X') {
			return '+';
		}
		return 'X';
	}
	*/
	
	
	
}
