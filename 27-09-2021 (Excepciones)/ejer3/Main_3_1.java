package com.ejer3;

public class Main_3_1 {

	public static void main(String[] args) {
		int nums[][] = new int[2][3];
		
		for(int i = 0; i < 2; i++) { 
			for(int j = 0; j < 3; j++) {
				nums[i][j] = i + j;
			}
		}
		
		for (int i = 0; i < 3; i++) { 
			for(int j = 0; j < 3; j++) {
				String sNums = "5 * nums[" + i + "][" + j + "] / " + j;
				
				try {
					System.out.print("Segunda cifra de " + sNums + ": ");
					System.out.println(String.valueOf(5 * nums[i][j] / j).charAt(1));
				}catch(ArithmeticException e) {
					System.err.println("Error Aritmético! " + sNums);
				}catch(ArrayIndexOutOfBoundsException e) {
					System.err.println("Error no existe nums[" + i + "][" + j +"]");
				}catch(Exception e) {
					System.err.println("Error al calcular " + sNums
							+ "\n\n"
							+ e.getMessage());					
				}
			}
		}

	}

}
