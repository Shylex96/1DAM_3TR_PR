package es.studium.exercise9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String nombreArchivo, palabraArchivo;

		System.out.print("Introduce el nombre del archivo:\n");
		nombreArchivo = scanner.nextLine();

		if (!nombreArchivo.contains(".txt")) {
			nombreArchivo = nombreArchivo + ".txt";
			System.out.println("Fichero seleccionado: '" + nombreArchivo + "'");
		} else {
			System.out.println("Fichero seleccionado: '" + nombreArchivo + "'");
		}

		File archivo1 = new File(nombreArchivo);
		if (!archivo1.exists()) {
			System.out.println("\nEl nombre del archivo no ha sido encontrado.");
			System.exit(1);
		} else {

			System.out.println("Introduce la palabra a buscar: ");
			palabraArchivo = scanner.nextLine();

			scanner.close();

			try {

				FileReader fr = new FileReader(archivo1);
				BufferedReader br = new BufferedReader(fr);

				String contenido, contenidoFichero = null;
				while ((contenido = br.readLine()) != null) {
					contenidoFichero = contenido;
				}
				if (contenidoFichero.contains(palabraArchivo)) {
					System.out.println("Palabra encontrada." );
				} else {
					System.out.println("Palabra no encontrada.");
				}
				br.close();

			} catch (IOException e) {
				System.out.println("Un error inesperado ha ocurrido.");
			}
		}
	}
}
