package com.ejer2;

public class Main_2_4 {

	public static void main(String[] args) {
		int a = 5, b = 2;
		
		System.out.println(divide(a, b));
		
		b = 0;
		System.out.println(divide(a, b));
		
		b = 3;
		System.out.println(divide(a, b));
	}
	
	public static String divide(int a, int b) {		
		try {
			int i = a / b;
			
			return a + " / " + b + " = " + i;
		} catch(ArithmeticException e) {
			return "Error al dividir: " + a + " / " + b;
		}
	}

}
