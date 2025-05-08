package com.ucb.tdd;

public class Calculadora {
	
	public String suma(String sumandos) throws Exception {
		
		/* 
		if(sumandos.equals("")) {
			return "0";
		}*/
		
		String[] s = sumandos.split(",");
		
		int resultado = 0;
		
		for(int i=0; i<s.length; i++) {
			int x = new Integer(s[i]);
			
			if(x <= 1000) {
				resultado = resultado + x;
			}
			if(x < 0) {
				throw new Exception();
			}
		}
		
		return (new Integer(resultado)).toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public String suma(String sumandos) throws Exception{
		if(sumandos != null && sumandos.equals("")) {
			return "0";
		}
		
		int total=0;
		String[] sumandosV=sumandos.split(",");
		
		Integer s = null;
		for(int i=0;i<sumandosV.length;i++) {
			s = new Integer(sumandosV[i]);
			
			if(s <= 1000) {
				total=total + s;
			}
			if(s < 0) {
				throw new Exception("Numero negativo");
			}
		}
		return (new Integer(total)).toString();
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public String suma(String sumandos) throws Exception {
		
		if(sumandos!= null && sumandos.equals(""))
			return "0";
		else {
			int suma=0;
			
			String[] args=sumandos.split(",");
			for(int i=0;i<args.length;i++) {
				int x = new Integer(args[i]);
				if(x <= 1000) {
					suma = suma + x;
				}
				if(x < 0) {
					throw new Exception("Numero Negativo");
				}
				
			}
			return (new Integer(suma)).toString();
		}
			
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	private final int MAX = 1000;
	
	public String suma(String sumandos) throws Exception {

		if(sumandos!=null && sumandos.equals("")) {
			return "0";
		}
		
		int total = 0;
		String[] sums = sumandos.split(",");
		for(int i = 0;i < sums.length ; i++) {
			int s = Integer.parseInt(sums[i]);
			if(s <= MAX) {
				total = total + s;
			}
			if(s < 0) {
				throw new Exception("El numero es negativo");
			}
		}
		
		return (new Integer(total)).toString();
			
	}*/

}
