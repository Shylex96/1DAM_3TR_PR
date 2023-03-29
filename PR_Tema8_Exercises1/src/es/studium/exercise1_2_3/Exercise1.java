package es.studium.exercise1_2_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		
		System.out.println("Escriba el contenido que desea guardar en el fichero 'fich1':");
		Scanner in = new Scanner(System.in); 
		String cadenaTexto = in.nextLine();
		in.close();

		try {
			// Abrir fichero
			FileWriter fw = new FileWriter ("fich1.txt");
			BufferedWriter bw = new BufferedWriter (fw);
			PrintWriter salida = new PrintWriter (bw);

			// Gestionar fichero
			salida.println(cadenaTexto);
			System.out.println("Información almacenada.");

			// Cerrar fichero
			salida.close();
			bw.close();
			fw.close();

		} catch (IOException ioe) {
			System.out.println("Error en fichero.");
		}

	}

}
