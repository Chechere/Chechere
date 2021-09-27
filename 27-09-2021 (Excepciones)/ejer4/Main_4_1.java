package com.ejer4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main_4_1 {

	public static void main(String[] args) {
		try {
			File f = tmpFileconCar("AAAA_", 'A', 5);
			System.out.println("Creado Fichero: " + f.getAbsolutePath());
			f.delete();
		}catch(IOException e) {
			System.err.println(e.getMessage());
		}

	}
	
	public static File tmpFileconCar(String preNomFich, char car, int numRep) throws IOException {
		
		File f = File.createTempFile(preNomFich, "");
		FileWriter fw = new FileWriter(f);
		
		for(int i = 0; i < numRep; i++) {
			fw.write(car);
		}
		
		fw.close();
		return f;
	}

}
