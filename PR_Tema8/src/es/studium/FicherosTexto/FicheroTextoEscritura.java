package es.studium.FicherosTexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FicheroTextoEscritura {

	public static void main(String[] args) {
		
		try {
			
			// Abrir fichero
			FileWriter fw = new FileWriter ("archivo.txt", true);
			BufferedWriter bw = new BufferedWriter (fw);
			PrintWriter salida = new PrintWriter (bw);
			
			// Gestionar fichero
			salida.println("Prueba dos de escritura");
			System.out.println("Información almacenada.");
			
			// Cerrar fichero
			salida.close();
			bw.close();
			fw.close();
			
		} catch(IOException ioe) {
			System.out.println("Error en fichero.");
		}

	}

}
