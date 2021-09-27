package com.ejer2;

public class Main_2_2 {
	public static void main(String[] args) {
		int a = 5;
		
		for(int i = 0; i <= a; i++) { 
			try {
				System.out.println(a + "/" + i + "=" + a / i);
			} catch(ArithmeticException e) {
				System.err.println("Error al dividir: " + a + "/" + i);
			}	
		}			
	}
}