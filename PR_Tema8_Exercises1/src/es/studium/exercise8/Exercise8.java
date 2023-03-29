package es.studium.exercise8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el nombre del archivo: ");
		String nombreArchivo = scanner.nextLine();
		scanner.close();
		
		if (!nombreArchivo.contains(".txt")) {
			nombreArchivo = nombreArchivo + ".txt";
		}

		try {

			FileReader fr = new FileReader(nombreArchivo);
			BufferedReader br = new BufferedReader(fr);

			int vocales = 0;
			int consonantes = 0;
			int puntuacion = 0;

			int letras;
			while ((letras = br.read()) != -1) {
				char caracter = (char) letras;
				//casteo
				
				
				if (esLetra(caracter)) {
					if (esVocal(caracter)) {
						vocales++;
					} else {
						consonantes++;
					} 
				} else if (esSignoPuntuacion(caracter)) {
					puntuacion++;
				}
			}

			br.close();

			System.out.println("\nEl archivo '" + nombreArchivo + "' tiene:");
			System.out.println(vocales + " vocales.");
			System.out.println(consonantes + " consonantes.");
			System.out.println(puntuacion + " signos de puntuación (incluidos: números y el espacio).");
		} catch (IOException e) {
			System.out.println("No se pudo leer el archivo " + nombreArchivo);
		}
	}

	private static boolean esLetra(char c) {
		
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
	}

	private static boolean esVocal(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' ||c == 'I' || c == 'O' || c == 'U';
	}

	/*
	private static boolean esEspacio(char c) {
		return c == ' ' || c == '\t' || c == '\n' || c == '\r';
	}
	*/

	private static boolean esSignoPuntuacion(char c) {
		return c == ' ' || c == '.' || c == ',' || c == ';' || c == ':' || c == '!' || c == '?' || 
				c == '-' || c == '"' || c == '\'' || c == '(' || c == ')' || c == '[' || c == ']' || 
				c == '{' || c == '}' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || 
				c == '6' || c == '7' || c == '8' || c == '9' || c == '0';
	}

}