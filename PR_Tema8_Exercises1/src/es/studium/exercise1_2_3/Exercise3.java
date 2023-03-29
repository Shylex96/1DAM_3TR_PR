package es.studium.exercise1_2_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("Escriba el contenido que desea añadir en el fichero 'fich1':");
		String cadenaTexto = in.nextLine();
		in.close();

		try {
			// Abrir fichero
			FileWriter fw = new FileWriter ("fich1.txt", true);
			BufferedWriter bw = new BufferedWriter (fw);
			PrintWriter salida = new PrintWriter (bw);

			// Gestionar fichero
			salida.println(cadenaTexto);
			System.out.println("Información agregada.");

			// Cerrar fichero
			salida.close();
			bw.close();
			fw.close();

		} catch (IOException ioe) {
			System.out.println("Error en fichero.");
		}

	}

}
