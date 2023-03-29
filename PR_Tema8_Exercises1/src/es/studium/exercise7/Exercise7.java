package es.studium.exercise7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise7
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String nombreArchivo1, nombreArchivo2;

		System.out.print("Introduce el nombre del archivo a copiar:\n");
		nombreArchivo1 = scanner.nextLine();
		if (nombreArchivo1.contains(".txt")) {
			System.out.println("Archivo escrito: '" +nombreArchivo1 + "'\n");
		} else {
			nombreArchivo1 = nombreArchivo1 + ".txt";
			System.out.println("Archivo escrito: '" +nombreArchivo1 + "'\n");
		}

		File archivo1 = new File(nombreArchivo1);
		if (!archivo1.exists()) {
			System.out.println("El nombre del archivo no ha sido encontrado.");

		} else {
			System.out.print("Introduce el nombre del archivo de destino:\n");
			nombreArchivo2 = scanner.nextLine();
			if (nombreArchivo2.contains(".txt")) {
				System.out.println("Archivo escrito: '" +nombreArchivo2 +"'\n");
			} else {
				nombreArchivo2 = nombreArchivo2 + ".txt";
				System.out.println("Archivo escrito: '" +nombreArchivo2 +"'\n");
			}


			File archivo2 = new File(nombreArchivo2);
			if (!archivo2.exists()) {
				System.out.println("El archivo de destino no se ha detectado y se ha creado uno nuevo.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}


			try {
				FileReader fr = new FileReader(archivo1);
				BufferedReader br = new BufferedReader(fr);

				boolean sobreescribir = true;

				if (archivo2.exists()) {
					System.out.print("El archivo de destino ya existe. ¿Desea sobrescribirlo? (s/n)\n");
					String respuesta = scanner.nextLine();

					if (respuesta.equals("n")) {
						sobreescribir = false;
						// Abrir el archivo de destino en modo de agregar al final
						FileWriter fw = new FileWriter(archivo2, true);
						BufferedWriter bw = new BufferedWriter(fw);
						//bw.newLine(); // Agregar una línea en blanco antes de copiar el contenido del primer archivo.
						
						String linea;
						while ((linea = br.readLine()) != null) {
							bw.write(linea);
							bw.newLine();
						}

						
						bw.close();
						fw.close();
					}
				}

				if (sobreescribir) {
					FileWriter fw = new FileWriter(archivo2, false);
					BufferedWriter bw = new BufferedWriter(fw);
					String linea;
					while ((linea = br.readLine()) != null) {
						bw.write(linea);
						bw.newLine();
					}
					br.close();
					bw.close();
				}

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
				System.out.println("El archivo ha sido actualizado correctamente.");

			} catch (IOException e) {
				System.out.println("Se ha producido un error de entrada/salida.");
				System.out.println("Verifique que los nombres son correctos.");
			} finally {
				scanner.close();
			}
		}


	}
}