package com.ejer2;

public class Main_2_3 {

	public static void main(String[] args) {
		int a = 5;
		int[] b2 = {2, 0, 3};		
		
		System.out.println("Array: ");
		for(int i = 0; i < b2.length; i++) {
			try {
				System.out.println("  " + a + "/" + b2[i] + "=" + a / b2[i]);				
			} catch(ArithmeticException e) {
				System.err.println("  Error al dividir: " + a + "/" + b2[i]);
			}
		}
		
		System.out.println("\nArgs:");
		for(int i = 0; i < args.length; i++) {
			try {
				System.out.println("  " + a + "/" + Integer.parseInt(args[i]) + "=" + a / Integer.parseInt(args[i]));				
			} catch(ArithmeticException e) {
				System.err.println("  Error al dividir: " + a + "/" + Integer.parseInt(args[i]));
			}
		}
	}
}
