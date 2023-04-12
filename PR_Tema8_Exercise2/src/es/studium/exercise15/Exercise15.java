package es.studium.exercise15;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		
		final int TAM = 10;
		Scanner in = new Scanner (System.in);
		int[] tabla = new int [TAM];
		String nombreFichero = "";
		System.out.println("Escribe el nombre del fichero:");
		nombreFichero = in.nextLine();
		in.close();
		
		try {
			
			FileInputStream fis = new FileInputStream(nombreFichero);
			BufferedInputStream bis = new BufferedInputStream(fis);
			//ObjectInputStream entradaBinaria = new ObjectInputStream(bis); // object lee todo tipo, cualquier objeto
			DataInputStream entradaBinaria = new DataInputStream(bis); // el data solo lee enteros, float, double y char
			
			System.out.println("Información del fichero: '" +nombreFichero + "'\n");
			for (int i = 0; i < TAM; i++){
				tabla[i] = entradaBinaria.readInt();
			}
			
			entradaBinaria.close();
			bis.close();
			fis.close();
			
			for (int numero: tabla){
				System.out.println(numero);
			}
			
		} catch (FileNotFoundException fnfe) {
			System.out.println("Fichero no encontrado." + nombreFichero);
		} catch (IOException ioe) {
			System.out.println("Error en el fichero." +ioe.getMessage());
		}
		
		
		

	}

}
