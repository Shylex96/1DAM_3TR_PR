package es.studium.FicherosBinarios;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FicheroBinarioEscritura {

	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos = new FileOutputStream("datos.dat");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream salidaBinaria = new DataOutputStream(bos);
			Double dato = 7.345;
			salidaBinaria.writeDouble(dato);
			salidaBinaria.close();
			bos.close();
			fos.close();
			System.out.println("Información guardada correctamente.");
			
		} catch (IOException ioe) {
			
			System.out.println("Error en el fichero " +ioe);
			
		}

	}

}
