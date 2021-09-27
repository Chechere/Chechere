package com.ejer4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

public class Main_4_2 {

	public static void main(String[] args) {
		File f1 = null;
		File f2 = null;
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		
		try { 
			Random rnd = new Random();
			int failMin = rnd.nextInt(3) + 1;
			
			if(failMin <= 1) {
				System.out.println("Se sale al llegar a: " + failMin);
				return;
			}
			
			fis1 = new FileInputStream("f1.dat");
			System.out.println("Abierto f1.dat");
			
			f1 = new File("f1.info.tmp");
			f1.createNewFile();
			System.out.println("Creado " + f1.getAbsolutePath());
			
			if(failMin <= 2) {
				System.out.println("Se sale al llegar a: " + failMin);
				return;
			}
			
			fis2 = new FileInputStream("f2.dat");
			System.out.println("Abierto f2.dat");
			
			f1 = new File("f1.info.tmp");
			f1.createNewFile();
			System.out.println("Creado " + f1.getAbsolutePath());
			
			System.out.println("Ejecutado hasta el final.");
		}catch(FileNotFoundException e) {
			System.err.println("Fichero no encontrado. " + e.getMessage());
		} catch (Exception e) {			
			e.printStackTrace();
		} finally {
			System.out.println("Liberando recursos: INICIO.");
			
			if(fis1 != null) {
				try {
					fis1.close();
					System.out.println("f1.dat cerrado.");
				}catch(IOException e) {
					System.err.println("Error al cerrar f1.dat " + e.getMessage());
				}
			}
			
			if(fis2 != null) {
				try {
					fis2.close();
					System.out.println("f2.dat cerrado.");
				}catch(IOException e) {
					System.err.println("Error al cerrar f2.dat " + e.getMessage());
				}
			}
			
			if(f1 != null) {
				f1.delete();
				System.out.println(f1.getName() + " eliminado.");
			}
			
			if(f2 != null) {
				f2.delete();
				System.out.println(f2.getName() + " eliminado.");
			}
			
			System.out.println("Liberando recursos: FIN.");
		}
	}
}