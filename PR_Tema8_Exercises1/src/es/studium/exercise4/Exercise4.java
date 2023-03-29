package es.studium.exercise4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {


		System.out.println("Escriba el contenido que desea guardar en el fichero 'fich2':");
		System.out.println("Recuerde escribir un '*' para terminar de escribir y enviar la información al fichero.");

		Scanner in = new Scanner(System.in); 
		char caracter;

		try {
			FileWriter fw = new FileWriter("fich2.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);

			do 
			{
				System.out.println("Escriba un caracter");
				caracter = in.nextLine().charAt(0);
				if (caracter != '*') 
				{
					salida.println(caracter);
				}
			} while (caracter != '*');
			System.out.println("Información almacenada");
			// Cerrar fichero
			salida.close();
			bw.close();
			fw.close();

		} catch (IOException ioe) {
			System.out.println("Error en fichero.");

		}
		in.close();


	}
}
