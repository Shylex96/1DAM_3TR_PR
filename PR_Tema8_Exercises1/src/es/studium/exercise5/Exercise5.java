package es.studium.exercise5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); 

		try {
			System.out.println("Escribe el nombre del primer archivo:");
			String archivo1 = in.nextLine();
			System.out.println("Escribe el nombre del segundo archivo:");
			String archivo2 = in.nextLine();


			// Abrir fichero
			FileReader fr1 = new FileReader (archivo1);
			FileReader fr2 = new FileReader (archivo2);
			BufferedReader br1 = new BufferedReader(fr1);
			BufferedReader br2 = new BufferedReader(fr2);

			String linea1, linea2;
			String contenido1="", contenido2="";


			while ((linea1=br1.readLine())!=null) {
				contenido1 = contenido1 + linea1;
			}
			
			while ((linea2 = br2.readLine()) !=null) {
				contenido2 = contenido2 + linea2;
			}


			br1.close();
			fr1.close();
			br2.close();
			fr2.close();

			// Gestionar fichero
			//String contenidoFichero1;
			//String contenidoFichero2;

			if (contenido1.equals(contenido2)) {
				System.out.println("El contenido de los ficheros es igual.");
			} else {
				System.out.println("El contenido de los ficheros es distinto.");
			}
			in.close();

			// Cerrar fichero
			

		} catch (FileNotFoundException fnfe) {
			System.out.println("Archivo no encontrado.");

		} catch(IOException ioe) {
			System.out.println("Error en fichero.");
		} 
	}
}
