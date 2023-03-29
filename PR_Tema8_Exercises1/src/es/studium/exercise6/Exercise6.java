package es.studium.exercise6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise6
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String nombreArchivo1, nombreArchivo2;
		System.out.print("Introduce el nombre del archivo a copiar:\n");
		nombreArchivo1 = scanner.nextLine();
		
		if (nombreArchivo1.contains(".txt")) {
			System.out.println("Archivo '" +nombreArchivo1 +"' detectado.");
		} else {
			nombreArchivo1 = nombreArchivo1 + ".txt";
			System.out.println("Archivo '" +nombreArchivo1 +"' detectado.\n");
		}


		File archivo1 = new File(nombreArchivo1);
		if (!archivo1.exists()) {
			System.out.println("El nombre del archivo no ha sido encontrado.");

		} else {
			System.out.print("Introduce el nombre del archivo de destino:\n");
			nombreArchivo2 = scanner.nextLine();
			if (nombreArchivo2.contains(".txt")) {
				System.out.println("Archivo '" +nombreArchivo2 +"' detectado.");
			} else {
				nombreArchivo2 = nombreArchivo2 + ".txt";
				System.out.println("Archivo '" +nombreArchivo2 +"' detectado.\n");
			}
			scanner.close();

			File archivo2 = new File(nombreArchivo2);

			try {

				FileReader fr = new FileReader(archivo1);
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter(archivo2, false);
				BufferedWriter bw = new BufferedWriter(fw);
				String linea;
				while ((linea = br.readLine()) != null) {
					bw.write(linea);
					bw.newLine();
				}

				br.close();
				bw.close();

				try {
					System.out.println("Procesando información.");
					Thread.sleep(500);
					System.out.println("Procesando información..");
					Thread.sleep(500);
					System.out.println("Procesando información...");
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("El archivo ha sido copiado correctamente.");

			} catch (IOException e) {
				System.out.println("Se ha producido un error de entrada/salida.");
			}
		}
	}
}